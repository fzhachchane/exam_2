package org.example.exam_2_test.controller;


import org.example.exam_2_test.Entity.Employee;
import org.example.exam_2_test.Model.EmployeeDto;
import org.example.exam_2_test.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> list() {
        List<EmployeeDto> employees = employeeService.getAll();
        return ResponseEntity.ok().body(employees);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return ResponseEntity.ok().body("Employee has been updated successfully.");
    }
}
