package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void when_hava_Teacher_class_should_introduce() {
        //given
        String name="Matt";
        int age=30;
        String job="Teacher";
        // when
        String introduceResult=Teacher.introduce(name,age,job);
        //then
        assertEquals(introduceResult,"My name is Matt. I am 30 years old. I am a Teacher.");
    }


}
