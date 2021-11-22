package phoenixSchool.src.service;

//import com.pheonix.DB.PhoenixSchoolDB;
import phoenixSchool.src.DB.PhoenixSchoolDB;
import phoenixSchool.src.exceptions.PhoenixStudentException;
import phoenixSchool.src.models.Student;

public class StudentServiceImpl implements StudentService{

    @Override
    public Student registerStudent(Student student) throws PhoenixStudentException {
           student = PhoenixSchoolDB.addStudent(student);
        return student;
    }

    @Override
    public Student findStudent(String studentId) throws PhoenixStudentException {
        return PhoenixSchoolDB.getStudent(studentId);
    }

    @Override
    public Student updateStudent(Student student) throws PhoenixStudentException {
        return PhoenixSchoolDB.addStudent(student);
    }
}
