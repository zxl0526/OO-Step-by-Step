package com.thoughtworks.basic;

/**
 * @author adminzxl
 */
public class Person {
    private String name;
    private int age;
    public  Person(String myName, int  myage) {
        this.name = myName;
        this.age = myage;
    }

    public static String introduce(String name, int age) {
        return "My name is "+name+". I am " + age + " years old.";
    }
}
