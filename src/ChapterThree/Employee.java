package ChapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
//    private double result;


    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setSalary(double i) {
        salary = i;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setFirstName(String name) {
        firstName = name;
    }
    public double getSalary(){
        return salary;
    }
    public void calculateForNewSalary(double percent){
        percent /= 100;
        salary = salary + (salary * percent);
//        return salary;
    }
}
