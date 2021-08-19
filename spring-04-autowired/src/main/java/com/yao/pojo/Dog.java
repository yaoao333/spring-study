package com.yao.pojo;

public class Dog {
    private String dogName;

    public void shout(){
        System.out.println("wang~");
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                '}';
    }
}
