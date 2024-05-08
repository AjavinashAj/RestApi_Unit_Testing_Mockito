package com.avinashit.service;

import com.avinashit.entity.Employee;
import com.avinashit.repository.EmployeeRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepo employeeRepo;
    private EmployeeServiceImpl employeeService;
    private Employee employee;
   // AutoCloseable autoCloseable;
    @BeforeEach
    void setUp() {
        this.employeeService=new EmployeeServiceImpl(this.employeeRepo);
        //AutoCloseable
       // AutoCloseable autoCloseable = MockitoAnnotations.openMocks(this);
        employee =new Employee(2,"krishna","mathura","God");
    }

    @AfterEach
    void tearDown() throws Exception {
      //  this.autoCloseable.close();
    }

    @Test
    @DisplayName("Create Employee Test Case")
    void createEmployee() {
        employeeService.createEmployee(employee);
        verify(employeeRepo).save(employee);
    }

    @Test
    @DisplayName("FindBYIDTest case")
    void getEmpById() {
        employeeService.getEmpById(employee.getId());
        verify(employeeRepo).findById(employee.getId());
    }

    @Test
    @DisplayName("Find All Test Case")
    void getAllEmployees() {
        employeeService.getAllEmployees();
        verify(employeeRepo).findAll();
    }

    @Test
    @DisplayName("Update Test Case")
    void updateEmp() {
        employeeService.updateEmp(employee);
        verify(employeeRepo).save(employee);
    }

    @Test
    @DisplayName("Find By Name Test Case")
    void findByName() {
        employeeService.findByName("krishna");
        verify(employeeRepo).findByName("krishna");
    }
}