package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void teachTest(){
        //given
        Instructor instructor = new Instructor("Leon");
        Student student = new Student("Amanda");
 //       double
        //when
        //then
    }
    @Test
    public void lectureTest(){
        //given
        Instructor instructor = new Instructor("Leon");
        Student[] students = new Student[1];
        Student student1 = new Student("Amanda");
        students[0] = student1;
        Double expectedStudyTime = 10.0;
        //when
        instructor.lecture(students, expectedStudyTime);
        Double actualStudyTime = students[0].getTotalStudyTime();
        //then
        Assert.assertEquals(expectedStudyTime, actualStudyTime);
    }

    @Test
    public void testImplementation(){
        //given
        //when
        Instructor instructor = new Instructor("Leon");
        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        //given
        //when
        Instructor instructor = new Instructor("Leon");
        //then
        Assert.assertTrue(instructor instanceof Person);
    }
}
