package com.avinashit.repository;

import com.avinashit.entity.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeRepoTest {

    @Autowired
    private  EmployeeRepo employeeRepo;
    private Employee employee;
    @BeforeEach
    void setUp() {
        employee=new Employee(1,"ram","delhi","engineer");
        employeeRepo.save(employee);
    }

    @AfterEach
    void tearDown() {
//        employee=null;
//        employeeRepo.deleteAll();
    }

    @Test
    void findByName() {
        List<Employee> employee1 = employeeRepo.findByName("ram");
        assertThat(employee1.get(0).getName()).isEqualTo("ram");
    }
}