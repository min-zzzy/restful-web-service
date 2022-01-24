package com.example.restfulwebservice.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (end-point)
    // 이전에는 @RequestMapping(method=RequestMethod.GET, path="/hello-world") 사용
    // @GetMapping(path="/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    //alt+enter -> 맥북은 옵션+엔터
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{person-name}")
    public HelloWorldBean helloWorldBean(@PathVariable(value = "person-name") String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }


}
