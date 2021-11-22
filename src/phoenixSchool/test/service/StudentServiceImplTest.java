package phoenixSchool.test.service;

//import com.pheonix.DB.PhoenixSchoolDB;
import phoenixSchool.src.DB.PhoenixSchoolDB;
import phoenixSchool.src.enums.Gender;
import phoenixSchool.src.exceptions.PhoenixSchoolException;
import phoenixSchool.src.exceptions.PhoenixStudentException;
import phoenixSchool.src.models.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phoenixSchool.src.service.StudentService;
import phoenixSchool.src.service.StudentServiceImpl;

//import static com.pheonix.DB.PhoenixSchoolDB.students;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {
    StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentServiceImpl();
//        PhoenixSchoolDB.getTotalNumberOfStudent();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void registerStudent() throws PhoenixSchoolException {
        Student dami = new Student("Dami", "Omotosho", Gender.FEMALE);
        assertEquals(2, PhoenixSchoolDB.getTotalNumberOfStudent());

            dami = studentService.registerStudent(dami);
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        assertEquals("PHX3", dami.getId());
    }

    @Test
    void registerNullStudent(){
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        assertThrows(PhoenixStudentException.class, () -> studentService.registerStudent(null));
    }

    @Test
    void findStudent(){
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        Student dami = null;
        try{
            dami = studentService.findStudent("PHX1");
        }catch(PhoenixStudentException e){
            e.printStackTrace();
        }
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        assertEquals("PHX1", dami.getId());
    }

    @Test
    void FindStudentWithNull(){
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
//        assertThrows(PhoenixStudentException.class, () -> studentService.findStudent(null));
    }

    @Test
    void findStudentWithInvalidStudentId(){
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        try{
            Student unknown = studentService.findStudent("PHX200");
            assertNull(unknown);
        }catch(PhoenixStudentException e){
            e.printStackTrace();
        }
        assertThrows(PhoenixStudentException.class, () -> studentService.registerStudent(null));

    }

//    @Test
//    void updateStudent(){
//        assertEquals(2, PhoenixSchoolDB.getTotalNumberOfStudent());
//        try{
//            Student dami = studentService.findStudent("PHX1");
//            assertNotNull(dami);
//            assertEquals("Dami", dami.getFirstName());
//            assertEquals("Omotosho", dami.getLastName());
//            assertNull(dami.getEmail());
//
//            dami.setEmail("dami@gmail.com");
//            studentService.updateStudent(dami);
//
//            Student updatedDami = studentService.findStudent("PHX1");
//            assertEquals("dami@gmail.com", updatedDami.getEmail());
//        }catch(PhoenixStudentException e){
//            e.printStackTrace();
//        }
//        assertThrows(PhoenixStudentException.class, () -> studentService.registerStudent(null));

//    }
}