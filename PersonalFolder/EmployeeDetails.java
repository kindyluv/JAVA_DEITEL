package PersonalFolder;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeDetails {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public void addNamesToList() {
        employees.add(new Employee("Addams", " Gomez"," Accounting"));
        employees.add(new Employee("Taylor", " Andy", " Public Admin"));
        employees.add(new Employee("Kirk", " James", " Marketing"));
    }

    public void changeName(){
        employees.add(3,(new Employee("presh", "lois", " Management")));
        employees.add(4,(new Employee("Eric", "lois", " Logistics")));
        employees.add(5,(new Employee("Ama", "lois", " Banking")));
        employees.add(6,(new Employee("kindy", "lois", " Finance")));
        employees.add(7,(new Employee("Ruth", "lois", " DevOps")));
        employees.add(8,(new Employee("Amaka", "lois", " Pharmacy")));


        System.out.println(employees);
    }


    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails();

        employeeDetails.addNamesToList();
        employeeDetails.changeName();
    }
}
