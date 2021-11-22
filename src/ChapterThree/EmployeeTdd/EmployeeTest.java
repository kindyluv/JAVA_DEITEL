package Chapter5.src.ChapterThree.EmployeeTdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    ChapterThree.Employee employee = new ChapterThree.Employee("Ade", "Israel", 15000.0);

    @Test
    public void employeeCanGetMonthlySalaryTest(){
     employee.setFirstName("Ade");
     employee.setLastName("Israel");
     employee.setSalary(15000.0);
        assertEquals(15000.0, employee.getSalary());
    }

    @Test
    public void employeeSalaryCanBeIncreasedByTenPercentTest(){
        employee.setSalary(15000.0);
        employee.calculateForNewSalary(20.0);
        assertEquals(18000.0, employee.getSalary());
    }

}