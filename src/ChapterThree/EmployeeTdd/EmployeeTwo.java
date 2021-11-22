package Chapter5.src.ChapterThree.EmployeeTdd;

public class EmployeeTwo {
    private String firstName;
    private String lastName;
    private double monthlySalary = 0;
    private int employee = 1;

    public EmployeeTwo(String firstName, String lastName, int employee){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employee = employee;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public double setMonthlySalary(double salary) {
        if (salary < 0){
            monthlySalary += 0;
        }else monthlySalary += salary;
        return salary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double calculateYearlySalary() {
       monthlySalary = monthlySalary * 12;
       return monthlySalary;
    }

    public double calculateNewSalary(double percentage) {
        percentage /=100;
        monthlySalary += monthlySalary * percentage;
        return monthlySalary;
    }

    public double calculateNewSalaryInMoreThanOneMonth(double percentage, int months) {
        percentage /= 100;
        monthlySalary +=  monthlySalary * percentage;
        monthlySalary *=months;
        return monthlySalary;
    }

    public void setEmployees(int employee) {
        this.employee = employee;
    }

    public int getEmployees() {
        return employee;
    }
}
