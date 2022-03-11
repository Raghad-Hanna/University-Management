package com.raghad.university.models.entities;

import javax.persistence.*;
import java.util.List;

import com.raghad.university.models.mapped_superclasses.Member;

@Entity
@SecondaryTable(name = "instructor_details")
public class Instructor extends Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(table = "instructor_details")
    private double salary;

    @ManyToOne
    @Column(table = "instructor_details")
    private Department department;

    @ManyToMany
    @JoinTable(name = "instructor_taught_section", joinColumns = @JoinColumn(name = "instructor_id"),
                                 inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    @ElementCollection
    @CollectionTable(name = "instructor_phone_number", joinColumns = @JoinColumn(name = "instructor_id"))
    private List<String> phoneNumbers;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Section> getSections() {
        return this.sections;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
