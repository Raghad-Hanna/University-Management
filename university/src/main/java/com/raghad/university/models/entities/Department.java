package com.raghad.university.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Department {
    @Id
    private String name;

    @Column(nullable = false)
    private String building;

    private double budget;

    @OneToMany(mappedBy = "department")
    private List<Course> courses;

    @OneToMany(mappedBy = "department")
    private List<Instructor> instructors;

    // TODO: should the department know about its students? - determine requirements and come back

    public void setName(String name) {
        this.name = name;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public String getName() {
        return name;
    }

    public String getBuilding() {
        return building;
    }

    public double getBudget() {
        return this.budget;
    }

    public List<Instructor> getInstructors() {
        return this.instructors;
    }
}
