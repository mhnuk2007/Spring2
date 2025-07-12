package com.learning;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("laptop object created");
    }
    public void compile(){
        System.out.println("compiling with laptop");
    }

}
