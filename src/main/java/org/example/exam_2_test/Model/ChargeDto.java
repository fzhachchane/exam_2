package org.example.exam_2_test.Model;


public class ChargeDto {
    private int id;
    private double charge;
    private EmployeeDto employee;
    private ProjectDto project;

    public ChargeDto(){
        super();
    }
    public ChargeDto(double charge, EmployeeDto employee, ProjectDto project) {
        this.charge = charge;
        this.employee = employee;
        this.project = project;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "id=" + id +
                ", charge=" + charge +
                ", employee=" + employee +
                ", project=" + project +
                '}';
    }
}
