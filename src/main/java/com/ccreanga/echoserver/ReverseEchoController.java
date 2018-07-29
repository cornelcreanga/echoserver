package com.ccreanga.echoserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseEchoController {
    @RequestMapping("/")
    public String reverseEcho(@RequestParam("text") String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
