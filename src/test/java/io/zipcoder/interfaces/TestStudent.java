package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void implementationTest(){
        //given
        //when
        Student student = new Student("Amanda");
        //then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        //given
        //when
        Student student = new Student("Amanda");
        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest(){
        //given
        Student student = new Student("Amanda");
        Double expectedTotalStudyTime = 10.0;
        //when
        student.learn(expectedTotalStudyTime);
        Double actualTotalStudyTime = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime);
    }
}
