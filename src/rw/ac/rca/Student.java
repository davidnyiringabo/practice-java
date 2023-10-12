package rw.ac.rca;

import rca.learn.co.Person;

public class Student extends Person {

     String school;
     String grade;
     String combination;

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void getNames(){
        this.firstName = "me";
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                ", combination='" + combination + '\'' +
                '}';
    }
}
