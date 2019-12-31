package com.test.userdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaoguang
 * @create 2019-12-31 15:02
 */
@RestController
public class UserController {
    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id) {
        return "the user id is " + id;
    }
}
