package com.raghad.university.models.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(nullable = false)
    private String title;

    private double credits;

    @ManyToMany
    @JoinTable(name = "course_prerequisite", joinColumns = @JoinColumn(name = "course_id"),
                                              inverseJoinColumns = @JoinColumn(name = "prerequisite_course_id"))
    private List<Course> prerequisites;

    @ManyToOne
    // TODO: make sure the name complies to the convention
    private Department department;

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public double getCredits() {
        return credits;
    }

    public Department getDepartment() {
        return department;
    }
}
