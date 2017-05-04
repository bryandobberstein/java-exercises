package org.launchcode.java.exercises.school;

import java.util.HashMap;

/**
 * Created by max on 5/4/17.
 */
public class Course {

    private String name;
    private int id;
    private int credits;
    private HashMap<String, Integer> roster;

    public void setName(String aName){
        this.name = aName;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int aId){
        this.id = aId;
    }

    public int getId(){
        return this.id;
    }

    public void setRoster(Student aStudent){
        roster.put(aStudent.getName(), aStudent.getId());
    }

    public void setCredits(int aCredits){
        this.credits = aCredits;
    }

    public int getCredits(){
        return this.credits;
    }

    public HashMap<String, Integer> getRoster(){
        return this.roster;
    }

    public boolean equals(Object aCourse){
        return ((Course) aCourse).getId() == this.getId();
    }

    public String toString(){
        return "Course Name: " + this.name + "Course ID: " + this.id;
    }
}
