package com.thoughtworks.basic.Service;

import com.thoughtworks.basic.DTO.ClassAndGradeDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adminzxl
 */
@Data
public class Student extends Person {

    private ClassAndGradeDTO classAndGradeDTO;

    private List<Person> teachers = new ArrayList<>();

    public Student(String myName, int myage, ClassAndGradeDTO classAndGradeDTO) {
        super(myName, myage);
        this.classAndGradeDTO = classAndGradeDTO;
    }
    @Override
    public String  introduce(String name, int age, int classNumber){//显示班级

        System.out.println("My name is "+name+". I am " + age + " years old. I am a Student of Class" + classNumber);
        return "My name is "+name+". I am " + age + " years old. I am a Student of Class " + classNumber+" .";
    }

    public void changeName(String name){
        super.setName(name);
        this.notifyTeachChangeName();
    }

    public void notifyTeachChangeName(){
        for (Person teacher: teachers) {
            teacher.introduce(this.getName(), this.getAge(), this.classAndGradeDTO.getClassNumber());
        }
    }

    public void notifyTeachChangeClass(){
        for (Person teacher: teachers) {
            teacher.introduce(this.getName(), this.getAge(), this.classAndGradeDTO.getClassNumber());
        }
    }

    public void changeClass(ClassAndGradeDTO classAndGradeDTO){
        this.classAndGradeDTO = classAndGradeDTO;
        notifyTeachChangeClass();
    }

    public ClassAndGradeDTO getClassAndGradeDTO() {
        return classAndGradeDTO;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }
}