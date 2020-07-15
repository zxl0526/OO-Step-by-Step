package com.thoughtworks.basic.ServiceTest;

import com.thoughtworks.basic.Service.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class PersonTest {

    @Test
    public void when_give_Name_IS_TOM_AGE_IS_21_should_introduce() {
        //given
        String name="Tom";
        int age=21;
        int classNum = 1001;
        // when
        //String introduceResult= Person.introduce(name,age,classNum);
        //then
        //assertEquals(introduceResult,"My name is Tom. I am 21 years old.");
    }


}
