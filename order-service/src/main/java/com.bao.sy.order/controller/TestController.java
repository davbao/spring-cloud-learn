package com.bao.sy.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author davbao
 * @date 2022/10/10
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/check")
    public String check() {
        return "ok";
    }
}

