package phoenixSchool.test;

import phoenixSchool.src.DB.PhoenixSchoolDB;
import phoenixSchool.src.enums.Gender;
import phoenixSchool.src.exceptions.PhoenixSchoolException;
import phoenixSchool.src.models.Student;
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