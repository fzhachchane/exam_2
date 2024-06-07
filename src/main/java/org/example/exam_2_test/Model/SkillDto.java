package org.example.exam_2_test.Model;

import org.example.exam_2_test.Entity.Employee;

public class SkillDto {
    private int id;
    private String skillName;
    private Employee employee;

    public SkillDto(){
        super();
    }

    public SkillDto(String skillName, Employee employee) {
        this.skillName = skillName;
        this.employee = employee;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skillName='" + skillName + '\'' +
                ", employee=" + employee +
                '}';
    }
}
