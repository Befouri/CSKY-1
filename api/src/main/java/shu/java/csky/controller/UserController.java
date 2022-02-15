package shu.java.csky.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import shu.java.csky.UserService;
import shu.java.csky.annotation.UserLoginToken;
import shu.java.csky.entity.User;
import shu.java.csky.vo.ResStatus;
import shu.java.csky.vo.ResultVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/login")
    public ResultVO login(@RequestBody User user) {
        ResultVO resultVO = userService.checkLogin(user.getUsername(), user.getPassword());
        logger.info(resultVO.getMsg());
        return resultVO;
    }

    @PostMapping("/register")
    public ResultVO register(@RequestBody User user) {
        ResultVO resultVO = userService.userRegister(user.getUsername(), user.getPassword(), user.getUserEmail());
        logger.info(resultVO.getMsg());
        return resultVO;
    }

    @GetMapping("/check")
    public ResultVO userTokenCheck(@RequestHeader("token") String token) {
        return new ResultVO(ResStatus.OK, "success", null);
    }

    @UserLoginToken
    @GetMapping("/get/{id}")
    public ResultVO findUserById(@PathVariable String id) {
        User user = userService.findUserById(id);
        return new ResultVO(ResStatus.OK, "获取成功！", user);
    }

}
