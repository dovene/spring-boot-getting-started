package com.dev.hello.model;

public class HelloWorld {
    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greetFriend() {
        return "hello "+ name;
    }

}

