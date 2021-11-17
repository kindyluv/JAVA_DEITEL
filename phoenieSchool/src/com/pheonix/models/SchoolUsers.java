package com.pheonix.models;

import com.pheonix.enums.Gender;
import com.pheonix.enums.Status;
import lombok.Data;

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
