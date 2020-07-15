package com.thoughtworks.basic.ServiceTest;
import com.thoughtworks.basic.DTO.ClassAndGradeDTO;
import com.thoughtworks.basic.Service.Student;
import com.thoughtworks.basic.Service.Teacher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class InfosChangeTest {
    @Test
    public void when_students_Nameinfo_change_should_notice_other_student() {
        Teacher teacher=new Teacher("Matts",30,"Teacher");
        List<Student> students=new ArrayList<>();
        ClassAndGradeDTO classAndGradeDTO =new ClassAndGradeDTO();
        classAndGradeDTO.setClassNumber(2);

        Student studentA=new Student("Tom",22,classAndGradeDTO);
        Student studentB=new Student("May",20,classAndGradeDTO);

       // String NoticResultA= InfosChange.Notice(studentA.getName(),studentA.getAge(),studentlA.getClassAndGradeDTO().getClassNumber());

        //String introduceResultC= InfosChange.Notice(studentA.getName(),studentA.getAge(),studentA.getClassAndGradeDTO().getClassNumber());

        //then
      //  assertEquals(NoticResultA," My name is Tom. I am 21 years old. I am a student of Class 2 now.");

       // assertEquals(NoticResultA,"My name is Tom. I am 21 years old. I am a student of Class 2 now.");

    }


}
