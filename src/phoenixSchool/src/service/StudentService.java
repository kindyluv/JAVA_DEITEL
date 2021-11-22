package phoenixSchool.src.service;

import phoenixSchool.src.exceptions.PhoenixSchoolException;
import phoenixSchool.src.exceptions.PhoenixStudentException;
import phoenixSchool.src.models.Student;

public interface StudentService {
    Student registerStudent(Student student) throws PhoenixSchoolException;
    Student findStudent(String studentId) throws PhoenixStudentException;
    Student updateStudent(Student student) throws PhoenixStudentException;
}
