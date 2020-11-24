package io.zipcoder.interfaces;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String expectedName) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
