package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class PersonTest {

    @Test
    public void when_give_Name_IS_TOM_AGE_IS_21_should_introduce() {
        //given
        String name="Tom";
        int age=21;
        // when
        String introduceResult=Person.introduce(name,age);
        //then
        assertEquals(introduceResult,"My name is Tom. I am 21 years old.");
    }
    @Test
    public void when_hava_Student_class_should_introduce() {
        //given
        String name="Tom";
        int age=21;
        int classNumber=2;
        // when
        String introduceResult=Person.Student.introduces(name,age,classNumber);
        //then
        assertEquals(introduceResult,"My name is Tom. I am 21 years old. I am a Student of Class 2");
    }




}
