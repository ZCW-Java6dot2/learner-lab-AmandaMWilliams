package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestZipCodeWilmington {
    private TestZipCodeWilmington zipcode;

    @Before
    public void setup(){
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        zipcode.fireStaff();
    }

    @Test
    public void fireStaffTest(){
        //given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        List<Instructor> instructorList = new ArrayList<Instructor>();
        //when
        zipCodeWilmington.fireStaff();
        //then
        Assert.assertEquals(instructorList.size(), 0);
    }
}
