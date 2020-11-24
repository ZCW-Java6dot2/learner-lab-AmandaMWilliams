package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestZipCodeWilmington {
    private TestZipCodeWilmington zipCode;

    @Before
    public void setup(){
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void fireStaffTest(){
        //given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        List<Instructor> instructorList = new ArrayList<Instructor>();
        //when
        zipCodeWilmington.fireStaff();
        //then
        Assert.assertTrue(ZipCodeWilmington.getInstructors().isEmpty());
    }

    @Test
    public void hireStaffTest(){
        //given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        List<Instructor> instructorList = new ArrayList<Instructor>();
        String[] instructorNames = {"Amanda", "Leon"};
        //when
        for (String instructorName: instructorNames){
            Instructor instructor = new Instructor(instructorName);
            ZipCodeWilmington.hire(instructor);
        }
        //then
        Assert.assertEquals(zipCodeWilmington.getInstructors().size(), 2);
    }

}
