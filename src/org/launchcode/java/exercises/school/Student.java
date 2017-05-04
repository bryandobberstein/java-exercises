package org.launchcode.java.exercises.school;

/**
 * Created by max on 5/4/17.
 */
public class Student {

    private String name;
    private int id;
    private int credits;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getId() {
        return id;
    }

    public void setId(int aId) {
        this.id = aId;
    }

    public void setCredits(int aCredits){
        this.credits = aCredits;
    }

    public int getCredits(){
        return this.credits;
    }

    public void setGps(double aGpa){
        this.gpa = aGpa;
    }

    public double getGpa(){
        return this.gpa;
    }
}
