package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void when_hava_Student_class_should_introduce() {
        //given
        String name="Tom";
        int age=21;
        int classNumber=2;
        // when
        String introduceResult=Student.introduce(name,age,classNumber);
        //then
        assertEquals(introduceResult,"My name is Tom. I am 21 years old. I am a Student of Class 2");
    }
}
