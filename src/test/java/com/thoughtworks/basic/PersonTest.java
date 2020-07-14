package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class PersonTest {
    private String name;
    private int age;
    public void Person(String myName, int  myage) {
        this.name = myName;
        this.age = myage;
    }

    @Test
    public void when_give_Name_IS_TOM_AGE_IS_21_should_introduce() {
        //given
        name="Tom";
        age=21;
        // when
        String introduceResult=Person.introduce(name,age);
        //then
        assertEquals(introduceResult,"My name is Tom. I am 21 years old.");
    }
}
