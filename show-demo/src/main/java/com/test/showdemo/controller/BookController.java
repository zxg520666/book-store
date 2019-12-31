package com.test.showdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaoguang
 * @create 2019-12-31 14:58
 */
@RestController
public class BookController {
    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id) {
        return "the book id is " + id;
    }
}
