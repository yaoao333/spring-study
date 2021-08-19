package com.yao.pojo;

public class Cat {
    private String catName;

    public void shout(){
        System.out.println("miao~");
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                '}';
    }
}
