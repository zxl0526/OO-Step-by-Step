package com.thoughtworks.basic;

/**
 * @author adminzxl
 */
public class Student extends Person {
    public int classNumber;
    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
    Student(String name ,int age ,int classNumber){//子类构造方法
        super(name,age);
        this.classNumber = classNumber;
    }

    public static String  introduce(String name, int age, int classNumber){//显示班级

        //System.out.println("My name is "+name+". I am " + age + " years old. I am a Student of Class" + classNumber);
        return "My name is "+name+". I am " + age + " years old. I am a Student of Class " + classNumber;
    }
}