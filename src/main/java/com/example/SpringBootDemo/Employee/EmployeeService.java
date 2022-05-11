package com.example.SpringBootDemo.Employee;

import org.springframework.stereotype.Service;

@Service //Same as @Component
public class EmployeeService {

    java.util.List<Employee> getEmployees(){
        Employee e1= new Employee("John",35,'M',100);
        Employee e2= new Employee("Mark",45,'M',150);
        return java.util.List.of(e1,e2);
    }
}
