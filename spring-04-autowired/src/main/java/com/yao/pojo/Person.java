package com.yao.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
    @Autowired
    private Cat myCat;
    @Autowired
    private Dog myDog;

    public String getName() {
        return name;
    }

    public Cat getMyCat() {
        return myCat;
    }

    public Dog getMyDog() {
        return myDog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMyCat(Cat myCat) {
        this.myCat = myCat;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", myCat=" + myCat +
                ", myDog=" + myDog +
                '}';
    }
}
