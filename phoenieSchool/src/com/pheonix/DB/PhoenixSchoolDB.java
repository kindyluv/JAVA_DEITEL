package com.pheonix.DB;

import com.pheonix.enums.Gender;
import com.pheonix.exceptions.PhoenixSchoolException;
import com.pheonix.exceptions.PhoenixStudentException;
import com.pheonix.models.Student;

import java.util.TreeMap;
import java.util.Map;


public class PhoenixSchoolDB {
    private static int totalNumberOfStudent =0;
    private static Map<String, Student> students = new TreeMap<>();

    static {
        try{
            Student dami = new Student("Dami", "Omotosho", Gender.FEMALE);
            PhoenixSchoolDB.addStudent(dami);

            Student tife = new Student("Tife", "Olanipekun", Gender.MALE);
            PhoenixSchoolDB.addStudent(tife);
        }catch(PhoenixStudentException e){
            e.printStackTrace();
        }
    }

    public static Map<String, Student> getStudents() {
        return students;
    }

    private static void setStudents(Map<String, Student> students) {
        PhoenixSchoolDB.students = students;
    }

    public static Student addStudent(Student newStudent) throws PhoenixStudentException {
        if(newStudent==null) throw new PhoenixStudentException("Student details are required");
        newStudent.setId(generateStudentId());

        if(newStudent.getId() == null) newStudent.setId(generateStudentId());

        students.put(newStudent.getId(), newStudent);
        return newStudent;
    }

    public static Student getStudent(String studentId){
        if(studentId == null){
            throw new NullPointerException("Student Is required");
        }
        Student found = students.get(studentId);
        return found;
    }

    private static String generateStudentId(){
        StringBuilder id = new StringBuilder("PHX");
        totalNumberOfStudent++;
        id.append(totalNumberOfStudent);
        return id.toString();
    }

    public static int getTotalNumberOfStudent() {
        return totalNumberOfStudent;
    }
}
