package org.example.exam_2_test.Model;

import org.example.exam_2_test.Entity.Charge;

import java.util.HashSet;
import java.util.Set;

public class ProjectDto {
    private int id;
    private String name;
    private double budget;
    private Set<Charge> charges = new HashSet<Charge>();

    public ProjectDto(){
        super();
    }
    public ProjectDto(String name, double budget, Set<Charge> charges) {
        this.name = name;
        this.budget = budget;
        this.charges = charges;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Set<Charge> getCharges() {
        return charges;
    }

    public void setCharges(Set<Charge> charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                ", charges=" + charges +
                '}';
    }
}
