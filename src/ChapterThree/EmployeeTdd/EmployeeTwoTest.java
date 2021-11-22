package Chapter5.src.ChapterThree.EmployeeTdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTwoTest {
    EmployeeTwo employee1 = new EmployeeTwo("toye", "Daramola", 20000);
    EmployeeTwo employee2 = new EmployeeTwo("toye", "Daramola", 20000);

    @BeforeEach
    void displayBeforeEach() {
        chapter3.EmployeeTwo employee = new chapter3.EmployeeTwo("toye", "Daramola", 20000);

    }

    @Test
    void testThatEmployeesFirstName(){  //HasFirstName
        employee1.setFirstName("Toye");
        assertEquals("Toye", employee1.getFirstName());
    }

    @Test
    void testThatEmployeesLastName(){   //HasSecondName
        employee1.setLastName("Daramola");
        assertEquals("Daramola", employee1.getLastName());
    }

    @Test
    void testThatEmployeesReceivesMonthlySalary() {
        employee1.setMonthlySalary(20000);
        assertEquals(20000, employee1.getMonthlySalary());
    }

    @Test
    void testThatEmployeesSalaryMustNotBeBelowZero() {  //CannotBeBelowZero
        employee2.setMonthlySalary(20000);
        assertEquals(20000, employee2.getMonthlySalary());
        employee2.setMonthlySalary(-20000);
        assertEquals(20000, employee2.getMonthlySalary());
    }

    @Test
    void testThatEmployeesYearlySalariesCanBeCalculated() {   //Calculated by/from what?
        employee2.setMonthlySalary(20000.0);
        assertEquals(240000,employee2.calculateYearlySalary());
    }

    @Test
    void testThatEmployeesYearlySalariesCanBeIncreasedByTenPercentage() {   //At what month/year
        employee1.setMonthlySalary(20000);
        assertEquals(22000, employee1.calculateNewSalary(10));
    }

    @Test
    void testThatEmployeesYearlySalariesCanBeIncreasedByTenPercentageInAYear() {
        employee1.setMonthlySalary(20000);
        assertEquals(264000, employee1.calculateNewSalaryInMoreThanOneMonth(10, 12));
    }

    @Test
    void testThatEmployeeHasEmployeeOne(){  //Instantiate object of class instead
        employee2.setFirstName("Eric");
        assertEquals("Eric", employee2.getFirstName());
        employee2.setLastName("Chineye");
        assertEquals("Chineye", employee2.getLastName());
        employee2.setEmployees(1);
        assertEquals(1, employee2.getEmployees());
    }

    @Test
    void testThatEmployeeHasEmployeeTwo(){  //Instantiate object of class instead
        employee2.setFirstName("Eric");
        assertEquals("Eric", employee2.getFirstName());
        employee2.setLastName("Chineye");
        assertEquals("Chineye", employee2.getLastName());
        employee2.setEmployees(2);
        assertEquals(2, employee2.getEmployees());
    }
}