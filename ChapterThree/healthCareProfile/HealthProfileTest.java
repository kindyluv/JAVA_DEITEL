package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HealthProfileTest {
    HealthProfile record = new HealthProfile("Precious", "Onyeukwu", "Female", 10, 1, 1996);

    @BeforeEach
    void displayBeforeEach(){
        HealthProfile record = new HealthProfile("Precious", "Onyeukwu", "Female", 10, 1, 1996);
    }

    @Test
    void testThatHealthProfileHasPatientFirstName(){
        record.setFirstName("kim");
        assertEquals("kim",record.getFirstName());
    }

    @Test
    void testThatHealthProfileHasPatientLastName(){
        record.setLastName("Mojoyin");
        assertEquals("Mojoyin",record.getLastName());
    }

    @Test
    void testThatHealthProfileHasPatientGender() {
        record.setGender("Female");
        assertEquals("Female", record.getGender());
    }

//    @Test
//    void testThatHealthProfileHasPatientDayOfBirth(){
//        record.setDayOfBirth(31);
//        assertEquals(31, record.getDayOfBirth());
//    }
//
//    @Test
//    void testThatHealthProfileHasPatientMonthOfBirth(){
//        record .setMonthOfBirth(10);
//        assertEquals(10, record.getMonthOfBirth());
//    }
//
//    @Test
//    void testThatHealthProfileHasPatientYearOfBirth(){
//        record .setYearOfBirth(2000);
//        assertEquals(2000, record.getYearOfBirth());
//    }

    @Test
    void testThatHealthProfileContainsPatientsFullInformation(){

    }

}