package com.thoughtworks.basic.Service;

/**
 * @author adminzxl
 */
public class Teacher extends Person {
    public String job;

    public void setJob(String job) {
        this.job = job;
    }

    public String  getJob(){
        return job;
    }
    Teacher(String name ,int age ,String job){//子类构造方法
        super(name,age);
        this.job = job;
    }
    public static String  introduce(String name, int age, String job){//显示工作
        // System.out.println("My name is "+name+". I am " + age + " years old. I am a Student of Class" + classNumber);
        return "My name is "+name+". I am " + age + " years old. I am a " + job+".";
    }

}
