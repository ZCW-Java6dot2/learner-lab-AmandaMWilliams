package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    private HashMap hashMap;

    public static HashMap<String, Person> getRoster(ArrayList<Person> list) {
        HashMap<String, Person> roster = new HashMap<String, Person>();
        for (Person person : list) {
            roster.put(person.getName(), person);

        }
        return roster;
    }
}
