package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {
    private static ArrayList<Instructor> instructorList;
    private static Instructor instructor;

    public static ArrayList<Instructor> getInstructors(){
        return instructorList;
    }

    public static void hire(Instructor instructor){
        instructorList.add(ZipCodeWilmington.instructor);
    }

    public static void fireStaff(){
        instructorList.clear();
    }
    static { // static initializer
        String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
        for (String instructorName : instructorNames) {
            Instructor instructor = new Instructor(instructorName);
            hire(instructor);
        }
    }



}
