package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTechConnect {
    @Before
    public void setup(){
        TechConnect.removeStudents();
    }

    @Test
    public void removeStudentsTest(){
        //given
        TechConnect techConnect = new TechConnect();
        List<Student> studentList = new ArrayList<Student>();
        //when
        TechConnect.removeStudents();
        //then
        Assert.assertEquals(studentList.size(), 0);
    }

    @Test
    public void recruitStudentTest(){
        //given
        TechConnect techConnect = new TechConnect();
        List<Student> studentList = new ArrayList<Student>();
        final Student amanda = new Student("Amanda");

        //when
        TechConnect.recruitStudent(amanda);
        techConnect.getStudents();
        //then
        Assert.assertEquals(studentList.size(), 1);
    }
}
