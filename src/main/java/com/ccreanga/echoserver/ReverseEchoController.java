package com.ccreanga.echoserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseEchoController {
    public static final String DEFAULT = "Hi - you might want to pass the text parameter :)";
    @RequestMapping(value="/")
    public String reverseEcho(
            @RequestParam(name = "text",required = false,defaultValue = DEFAULT) String text) {

        return text.equals(DEFAULT)?DEFAULT:new StringBuilder(text).reverse().toString();
    }
}
