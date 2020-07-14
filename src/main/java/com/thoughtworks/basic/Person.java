package com.thoughtworks.basic;

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
    public static String introduce(String name, int age) {
        name="Tom";
        age=21;
        //System.out.println("My name is "+name+",my age is "+age);
        return "My name is "+name+". I am " + age + " years old.";
    }


}
