package br.com.fapen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "<h1>Hello, World!</h1>";
    }
}