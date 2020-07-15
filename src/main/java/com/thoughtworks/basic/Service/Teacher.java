package com.thoughtworks.basic.Service;

import com.thoughtworks.basic.DTO.ClassAndGradeDTO;

/**
 * @author adminzxl
 */
public class Teacher extends Person {

    private ClassAndGradeDTO classAndGradeDTO;
    public String job;

    public void setJob(String job) {
        this.job = job;
    }

    public String  getJob(){
        return job;
    }
    public Teacher(String name, int age, String job){//子类构造方法
        super(name,age);
    }

    @Override
    String introduce(String name, int age, int classNum) {
        System.out.println("My name is "+name+". I am " + age + " years old. I am a Student of Class" + classNum);
        return "My name is "+name+". I am " + age + " years old. I am a " + classNum+".";
    }

    public static String  introduce(String name, int age, String job){//显示工作
        // System.out.println("My name is "+name+". I am " + age + " years old. I am a Student of Class" + classNumber);
        return "My name is "+name+". I am " + age + " years old. I am a " + job+".";
    }


    public ClassAndGradeDTO getClassAndGradeDTO() {
        return classAndGradeDTO;
    }

    public void setClassAndGradeDTO(ClassAndGradeDTO classAndGradeDTO) {
        this.classAndGradeDTO = classAndGradeDTO;
    }
}
