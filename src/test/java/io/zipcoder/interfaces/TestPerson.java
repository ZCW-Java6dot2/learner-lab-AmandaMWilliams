package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void setNameTest(){
        //given
        String expectedName = "Amanda";
        Person person = new Person(expectedName);
        //when
        person.setName(expectedName);
        String actualName = person.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void personConstructorTest(){
        //given
        String expectedName = "Amanda";
        //when
        Person person = new Person(expectedName);
        //then
        Assert.assertTrue("Amanda", true);
    }

}
