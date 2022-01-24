package com.example.restfulwebservice.Helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloWorldBean {
    private String message;

/* @AllArgsConstructor lombok 으로 인해 생성 안해도됨
    public String getMessage(){
        return this.message;
    }

    public void setMessage(String msg){
        this.message=msg;
    }

    public HelloWorldBean(String message){
        this.message=message;
    }

 */
}
