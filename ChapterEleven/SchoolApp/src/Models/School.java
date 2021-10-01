package Models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long id;
    private String name;
    private List<Class> classes = new ArrayList<>();
    private List<Student> student = new ArrayList<>();
    private List<Staffs> staffs = new ArrayList<>();
    private String address;
    private String description;
    private SchoolType schoolType;
}
