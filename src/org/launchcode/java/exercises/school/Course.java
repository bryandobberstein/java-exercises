package org.launchcode.java.exercises.school;

import java.util.HashMap;

/**
 * Created by max on 5/4/17.
 */
public class Course {

    private String name;
    private int id;
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

    public HashMap<String, Integer> getRoster(){
        return this.roster;
    }
}
