package com.bayahopper.test.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "hello world";
    }
}
