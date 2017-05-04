package org.launchcode.java.exercises.school;

/**
 * Created by max on 5/4/17.
 */
public class Student {

    private String name;
    private final int id;
    private static int nextStudentId = 1;
    private int credits;
    private double gpa;

    public Student(String name, int id, int credits, double gpa){
        this.name = name;
        this.id = id;
        this.credits = credits;
        this.gpa = gpa;
    }

    public Student(String name, int id){
        this(name, id, 0, 0);
    }

    public Student(String name){
        this(name,nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade){
        this.setCredits(this.credits += courseCredits);
        double qualityScore = this.gpa / this.credits;
        this.setGpa(qualityScore / this.credits);
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getId() {
        return id;
    }

    public void setCredits(int aCredits){
        this.credits = aCredits;
    }

    public int getCredits(){
        return this.credits;
    }

    public void setGpa(double aGpa){
        this.gpa = aGpa;
    }

    public double getGpa(){
        return this.gpa;
    }

    public String getGradeLevel(){
        if (this.getCredits() < 30){
            return "Freshman";
        }
        else if (this.getCredits() < 60){
            return "Sophomore";
        }
        else if (this.getCredits() < 90){
            return "Junior";
        }
        else if (this.getCredits() < 120){
            return "Senior";
        }
        else{
            return "Professional Student";
        }
    }

    public boolean equal(Object aStudent){
        return ((Student) aStudent).getId() == this.getId();
    }

    public String toString(){
        return "Name: " + this.name + "ID: " + this.id + "Credits: " + this.credits + "Level: " + this.getGradeLevel() + "GPA: " + this.gpa;
    }
}
