package com.learning;

public class Alien {
    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding...");
        com.compile();
    }

}
