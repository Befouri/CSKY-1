package shu.java.csky;


import shu.java.csky.entity.User;
import shu.java.csky.vo.ResultVO;

public interface UserService {

    //用户注册
    ResultVO userRegister(String name, String pwd, String email);

    //用户登录
    ResultVO checkLogin(String name, String pwd);

    User findUserById(String userId);
}
