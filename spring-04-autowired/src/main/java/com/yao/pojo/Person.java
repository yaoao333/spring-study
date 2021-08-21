package com.yao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    @Value("yaoao")
    private String name;
    @Autowired
    @Qualifier("cat")
    private Cat myCat;
    @Autowired
    @Qualifier("dog")
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
