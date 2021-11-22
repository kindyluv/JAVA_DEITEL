package Chapter5.unknownFiles;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;

    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    @Override
    public String toString() {
        return "[Employee| " +
                 firstName + "\t " + lastName + "\t" + department +
                "]"+"\n";
    }

}
