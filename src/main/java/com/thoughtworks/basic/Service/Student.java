package com.thoughtworks.basic.Service;

import com.thoughtworks.basic.DTO.ClassAndGradeDTO;
import lombok.Data;

/**
 * @author adminzxl
 */
@Data
public class Student extends Person {

    private ClassAndGradeDTO classAndGradeDTO;

    public Student(String myName, int myage, ClassAndGradeDTO classAndGradeDTO) {
        super(myName, myage);
        this.classAndGradeDTO = classAndGradeDTO;
    }

    public static String  introduce(String name, int age, int classNumber){//显示班级

        //System.out.println("My name is "+name+". I am " + age + " years old. I am a Student of Class" + classNumber);
        return "My name is "+name+". I am " + age + " years old. I am a Student of Class " + classNumber;
    }
}