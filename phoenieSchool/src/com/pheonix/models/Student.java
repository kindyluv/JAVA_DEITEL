package com.pheonix.models;

import com.pheonix.enums.Gender;
import com.pheonix.enums.Status;

import java.util.List;

public class Student extends SchoolUsers{
    private List<Course> registeredCourses;

    public Student(String firstName, String lastName, Gender gender){
        this.setFirstName(firstName);
        setLastName(lastName);
        setStatus(Status.ACTIVE);
    }

    public Student(String fname, String lname, String email, Gender gender){
        this(fname, lname,gender);
        setEmail(email);
    }

//    public void setStatus()
}
