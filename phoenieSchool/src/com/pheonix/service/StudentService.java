package com.pheonix.service;

import com.pheonix.exceptions.PhoenixSchoolException;
import com.pheonix.exceptions.PhoenixStudentException;
import com.pheonix.models.Student;

public interface StudentService {
    Student registerStudent(Student student) throws PhoenixSchoolException;
    Student findStudent(String studentId) throws PhoenixStudentException;
    Student updateStudent(Student student) throws PhoenixStudentException;
}
