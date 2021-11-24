package phoenixSchool.src.models;

import lombok.Data;
import phoenixSchool.src.enums.Gender;
import phoenixSchool.src.enums.Status;

import java.time.LocalDate;

@Data
public abstract class SchoolUsers {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate dob;
    private Gender gender;
    private Status status;
}
