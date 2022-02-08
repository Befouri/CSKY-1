package shu.java.csky.Impl;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shu.java.csky.UserService;
import shu.java.csky.dao.UserMapper;
import shu.java.csky.entity.User;
import shu.java.csky.utils.MD5Utils;
import shu.java.csky.utils.UuidUtil;
import shu.java.csky.vo.ResStatus;
import shu.java.csky.vo.ResultVO;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public ResultVO userRegister(String name, String pwd, String email) {
        synchronized (this) {
            //1.根据用户查询，这个用户是否已经被注册
            Example example = new Example(User.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("username", name);
            User user = userMapper.selectOneByExample(example);

            //2.如果没有被注册则进行保存操作
            if (user == null) {
                String md5Pwd = MD5Utils.md5(pwd);
                User u = new User();
                u.setUsername(name);
                u.setPassword(md5Pwd);
                u.setUserImg("img/default.png");
                u.setUserEmail(email);
                u.setUserCode(UuidUtil.getUuid());
                u.setUserStatus("N");
                u.setUserRegtime(new Date());
                u.setUserModtime(new Date());
                int i = userMapper.insertUseGeneratedKeys(u);
                if (i > 0) {
                    // todo 修改前端网址
//                    String content = "<a href='http://localhost:8080/csky/user/active?code=" + u.getUserCode() + "'>点击激活【CS考研网】</a>";
//                    MailUtils.sendMail(u.getUserEmail(), content, "CS考研网激活邮件");
                    return new ResultVO(ResStatus.OK, "注册成功！", u);
                } else {
                    return new ResultVO(ResStatus.NO, "注册失败！", null);
                }
            } else {
                return new ResultVO(ResStatus.NO, "用户名已经被注册！", null);
            }
        }
    }

    @Override
    public ResultVO checkLogin(String name, String pwd) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", name);
        User user = userMapper.selectOneByExample(example);

        if (user == null) {
            return new ResultVO(ResStatus.NO, "登录失败，用户名不存在！", null);
        } else {
            String md5Pwd = MD5Utils.md5(pwd);
            if (md5Pwd.equals(user.getPassword())) { // 密码正确
                if (!"Y".equalsIgnoreCase(user.getUserStatus())) { // 判断是否激活
                    return new ResultVO(ResStatus.NO, "请先激活", null);
                } else {
                    //如果登录验证成功且已经激活，则需要生成令牌token（token就是按照特定规则生成的字符串）
                    //使用jwt规则生成token字符串
                    JwtBuilder builder = Jwts.builder();

//                HashMap<String, Object> map = new HashMap<>();
//                map.put("key1", "value1");
//                map.put("key2", "value2");

                    String token = builder.setSubject(name)                     //主题，就是token中携带的数据
                            .setIssuedAt(new Date())                            //设置token的生成时间
                            .setId(user.getUserId() + "")               //设置用户id为token  id
//                        .setClaims(map)                                     //map中可以存放用户的角色权限信息
                            .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000)) //设置token过期时间
                            .signWith(SignatureAlgorithm.HS256, "hcy666")     //设置加密方式和加密密码
                            .compact();
                    return new ResultVO(ResStatus.OK, token, user);
                }
            } else { // 密码错误
                return new ResultVO(ResStatus.NO, "登录失败，密码错误！", null);
            }
        }
    }

    @Override
    public ResultVO active(String code) {
        //1.根据激活码查询用户对象
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userCode", code);
        User user = userMapper.selectOneByExample(example);

        if (user != null) {
            //2.调用dao的修改激活状态的方法
            user.setUserStatus("Y");
            userMapper.updateByExample(user, example);
            // 激活成功
            // todo 前端页面变化
            String msg = "激活成功，请<a href='login.html'>登录</a>";
            return new ResultVO(ResStatus.OK, msg, user);
        } else {
            String msg = "激活失败，请联系管理员!";
            return new ResultVO(ResStatus.OK, msg, null);
        }
    }
}
