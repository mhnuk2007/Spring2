package com.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("desktop object created");
    }
    public void compile(){
        System.out.println("compiling with desktop");
    }
}
