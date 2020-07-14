package com.thoughtworks.basic.ServiceTest;
import com.thoughtworks.basic.DTO.ClassAndGradeDTO;
import com.thoughtworks.basic.Service.Person;
import com.thoughtworks.basic.Service.Student;
import com.thoughtworks.basic.Service.Teacher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class ClassAndGradeTest {
    @Test
    public void AClass_have_more_students_and_a_teacher() {
        Teacher teacher=new Teacher("Matts",30,"Teacher");
        List<Student> students=new ArrayList<>();
        ClassAndGradeDTO classAndGradeDTO =new ClassAndGradeDTO();
        classAndGradeDTO.setClassNumber(3);
        Student studentA=new Student("Tom",22,classAndGradeDTO);
        Student studentB=new Student("May",20,classAndGradeDTO);
        String introduceResultA= studentA.introduce(studentA.getName(),studentA.getAge(),studentA.getClassAndGradeDTO().getClassNumber());
        String introduceResultB= studentA.introduce(studentB.getName(),studentB.getAge(),studentB.getClassAndGradeDTO().getClassNumber());
        String introduceResultC= Teacher.introduce(teacher.getName(),teacher.getAge(),teacher.getJob());
        //then
        assertEquals(introduceResultA,"My name is Tom. I am 22 years old. I am a Student of Class 3");
        assertEquals(introduceResultB,"My name is May. I am 20 years old. I am a Student of Class 3");
        assertEquals(introduceResultC,"My name is Matts. I am 30 years old. I am a Teacher.");

    }

}
