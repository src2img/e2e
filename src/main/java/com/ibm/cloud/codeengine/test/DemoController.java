package com.ibm.cloud.codeengine.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "<h1 style='color:blue'>Hello There!</h1>";
    }

}
