//package com.bluestar.WebReader.controller;
//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.nio.file.Files;
//
//@RestController
//@RequestMapping("/api/v1")
//public class NoveController {
//    @RequestMapping("/ping")
//    public String Ping() {return "Pong!";}
//    @GetMapping(value = "/novel/{name}/{page}", produces = MediaType.TEXT_HTML_VALUE+";charset=UTF-8")
//    public String getFile(@PathVariable("name") String name, @PathVariable("page") String page) throws IOException {
//        Resource resource = new ClassPathResource("static/nove/"+name+"_"+page+".html");
//        byte[] fileBytes = Files.readAllBytes(resource.getFile().toPath());
//        return new String(fileBytes);
//    }
//
//}
