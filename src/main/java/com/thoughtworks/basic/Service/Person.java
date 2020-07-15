package com.thoughtworks.basic.Service;

/**
 * @author adminzxl
 */
public abstract class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public  Person(String myName, int myage) {
        this.name = myName;
        this.age = myage;

       }
    abstract String introduce(String name, int age, int classNum);


}
