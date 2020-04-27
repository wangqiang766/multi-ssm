package com.wq.controller;

import com.wq.domain.MultiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    @PostMapping("/selectUserInfo")
    public MultiResponse selectUserInfo(HttpServletRequest request, HttpServletResponse response){
        logger.info("selectUserInfo.............................................................查询用户信息");
        return MultiResponse.success();
    }
}
