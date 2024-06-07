package org.example.exam_2_test.Model;


import org.example.exam_2_test.Entity.Charge;
import org.example.exam_2_test.Entity.Post;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDto {
    private int id;
    private String name, email;
    private Post post;
    private String skill;
    private Set<ChargeDto> charges = new HashSet<ChargeDto>();


    public EmployeeDto(){
        super();
    }

    public EmployeeDto(String name, String email, String skills, Post post, Set<ChargeDto> charges) {
        this.name = name;
        this.email = email;
        this.skill = skills;
        this.post = post;
        this.charges = charges;
    }
    public EmployeeDto(String name, String email, Post post) {
        this.name = name;
        this.email = email;
        this.post = post;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public List<Skill> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(List<Skill> skills) {
//        this.skills = skills;
//    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Set<ChargeDto> getCharges() {
        return charges;
    }

    public void setCharges(Set<ChargeDto> charges) {
        this.charges = charges;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", skills=" + skill +
                ", post=" + post +
                ", charges=" + charges +
                '}';
    }
}
