package com.pheonix.DB;

import com.pheonix.enums.Gender;
import com.pheonix.exceptions.PhoenixSchoolException;
import com.pheonix.models.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoenixSchoolDBTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addStudent() {
        assertTrue(PhoenixSchoolDB.getStudents().isEmpty());
        Student tife = new Student("Tife", "Olanipekun", Gender.MALE);
        try{
            PhoenixSchoolDB.addStudent(tife);

        }catch(PhoenixSchoolException e){
            e.printStackTrace();
        }
        assertFalse(PhoenixSchoolDB.getStudents().isEmpty());
    }

    @Test
    void addNullStudent(){
        assertThrows(PhoenixSchoolException.class, ()->PhoenixSchoolDB.addStudent(null));
    }
}