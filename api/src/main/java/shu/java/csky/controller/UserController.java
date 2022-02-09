package shu.java.csky.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import shu.java.csky.UserService;
import shu.java.csky.entity.User;
import shu.java.csky.vo.ResStatus;
import shu.java.csky.vo.ResultVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(value = "提供用户的登录和注册接口", tags = "用户管理")
@CrossOrigin
public class UserController {
    @Resource
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "username", value = "用户登录账号", required = true),
            @ApiImplicitParam(dataType = "string", name = "password", value = "用户登录密码", required = true)
    })
    @GetMapping("/login")
    public ResultVO login(@RequestParam("username") String name,
                          @RequestParam(value = "password") String pwd) {
        ResultVO resultVO = userService.checkLogin(name, pwd);
        logger.info(resultVO.getMsg());
        return resultVO;
    }

    @ApiOperation("用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "username", value = "用户注册账号", required = true),
            @ApiImplicitParam(dataType = "string", name = "password", value = "用户注册密码", required = true),
            @ApiImplicitParam(dataType = "string", name = "userEmail", value = "用户注册邮箱(激活用)", required = true)
    })
    @PostMapping("/register")
    public ResultVO register(@RequestBody User user) {
        ResultVO resultVO = userService.userRegister(user.getUsername(), user.getPassword(), user.getUserEmail());
        return resultVO;
    }

    @ApiOperation("校验用户是否激活接口")
    @ApiImplicitParam(dataType = "string", name = "code", value = "用户激活码", required = true)
    @GetMapping("/active/{code}")
    public ResultVO userActive(@PathVariable("code") String code) {
        if (code != null) {
            //2.调用service完成激活
            return userService.active(code);
        } else
            return new ResultVO(ResStatus.NO, "未收到验证码", null);
    }


    @ApiOperation("校验token是否过期接口")
    @GetMapping("/check")
    public ResultVO userTokencheck(@RequestHeader("token") String token) {
        return new ResultVO(ResStatus.OK, "success", null);
    }

}
