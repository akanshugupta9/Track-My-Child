package com.example.kanchicoder.trackmychildparent;

/**
 * Created by FamilyAngel on 11/8/2016.
 */

public class Student {
    private String studentName, schoolName;
    private int studentPhoto;

    public Student(String name, String school, int photo) {
        this.studentName = name;
        this.studentPhoto = photo;
        this.schoolName = school;

    }

    public String getStudentName(){
        return studentName;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public int getStudentPhoto(){
        return studentPhoto;
    }
}
