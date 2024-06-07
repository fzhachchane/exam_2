package org.example.exam_2_test.service;

import org.example.exam_2_test.dao.EmployeeDao;
import org.example.exam_2_test.dao.imp.EmployeeDaoImp;
import org.example.exam_2_test.Entity.Employee;

import java.util.List;

public class EmployeeService {
    EmployeeDao employeeDao;
    public EmployeeService(){
        employeeDao = new EmployeeDaoImp();
    }

    public List<Employee> selectAllService(){
        return employeeDao.selectAll();
    }

    public void addEmployeeService(Employee employee){
        employeeDao.addEmployee(employee);
    }
    public Employee findEmployeeService(int id){ return employeeDao.findEmployeeById(id);}
    public void deleteEmployeeService(int id){ employeeDao.deleteEmployee(id);}
}
