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
        ZipCodeWilmington zipCode = new ZipCodeWilmington();
        zipCode.fireStaff();
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
