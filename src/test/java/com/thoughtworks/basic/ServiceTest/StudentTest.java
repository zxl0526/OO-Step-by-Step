package com.thoughtworks.basic.ServiceTest;

import com.thoughtworks.basic.DTO.ClassAndGradeDTO;
import com.thoughtworks.basic.Service.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void when_hava_Student_class_should_introduce() {
        //given
        String name="Tom";
        int age=21;
        
        ClassAndGradeDTO classAndGradeDTO = new ClassAndGradeDTO();
        classAndGradeDTO.setClassNumber(2);
        
        // when
//        String introduceResult= Student.introduce(name,age,classAndGradeDTO.getClassNumber());
//        //then
//        assertEquals(introduceResult,"My name is Tom. I am 21 years old. I am a Student of Class 2 .");
    }
}
