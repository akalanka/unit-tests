package com.unittest.simpletest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by akalanka on 1/16/16.
 */
public class EmployeeServiceImplTest {

    @Test
    public void testAddEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        Employee employee = new Employee("chamila", "samarasinghe", 35);

        employeeService.addEmployee(employee);
        Assert.assertEquals(employee.getId(), 5);
    }

    @Test
    public void test_AddEmployee_ForExistingEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        Employee employee = new Employee("akalanka", "senevirathne", 30);

        try {
            employeeService.addEmployee(employee);
            Assert.fail("Test should have failed");
        } catch (ApplicationException e) {
            Assert.assertTrue(true);
        }
    }
}
