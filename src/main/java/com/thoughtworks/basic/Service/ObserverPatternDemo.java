package com.thoughtworks.basic.Service;

import com.thoughtworks.basic.DTO.ClassAndGradeDTO;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("李老师", 18,"班主任");

        ClassAndGradeDTO classAndGradeDTO = new ClassAndGradeDTO();
        classAndGradeDTO.setClassNumber(1001);
        classAndGradeDTO.setTeacher(teacher);

        Student student = new Student("小明",5, classAndGradeDTO);
        student.addTeacher(teacher);

        Teacher teacher1 = new Teacher("王老师", 18,"数学老师");

        student.changeName("小明明");
        student.addTeacher(teacher1);

        ClassAndGradeDTO classAndGradeDTO1 = new ClassAndGradeDTO();
        classAndGradeDTO1.setClassNumber(1002);
        classAndGradeDTO1.setTeacher(teacher1);
        student.changeClass(classAndGradeDTO1);
    }
}