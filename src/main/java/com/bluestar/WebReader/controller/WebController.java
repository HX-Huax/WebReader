package com.bluestar.WebReader.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebController {

    @RequestMapping("/ping")
    public String index() {return "Hello World";}


}
