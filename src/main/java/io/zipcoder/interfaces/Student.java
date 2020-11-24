package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(String name) {
        super(name);
    }

    public void learn(Double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public void setTotalStudyTime(){
        this.totalStudyTime = totalStudyTime;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
