package org.example.exam_2_test.dao;

import org.example.exam_2_test.Entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> selectAll();
    public void addEmployee(Employee employee);
    public Employee findEmployeeById(int id);
    public void deleteEmployee(int id);
}
