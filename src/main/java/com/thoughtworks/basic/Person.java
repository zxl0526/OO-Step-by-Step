package com.thoughtworks.basic;

/**
 * @author adminzxl
 */
public abstract class Person {
    private String name;
    private int age;
    public int classNumber;

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

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public  Person(String myName, int myage) {
        this.name = myName;
        this.age = myage;

       }
    public static String introduce(String name, int age) {
        name="Tom";
        age=21;
        System.out.println("My name is "+name+",my age is "+age);
        return "My name is "+name+". I am " + age + " years old.";
    }

    static class Student extends Person {
        int classNumber;
        Student(String name ,int age ,int classNumber){//子类构造方法
            super(name,age);
            this.classNumber = classNumber;
        }

        public static String  introduces(String name, int age, int classNumber){//显示班级

            //System.out.println("My name is "+name+". I am " + age + " years old. I am a Student of Class" + classNumber);
            return "My name is "+name+". I am " + age + " years old. I am a Student of Class " + classNumber;
        }
    }


}
