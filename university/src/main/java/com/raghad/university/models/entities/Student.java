package com.raghad.university.models.entities;

import javax.persistence.*;
import java.util.List;

import com.raghad.university.models.mapped_superclasses.Member;

@Entity
@SecondaryTable(name = "student_details")
public class Student extends Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(table = "student_details", name = "total_credits")
    private double totalCredits;

    @OneToOne
    @Column(table = "student_details")
    private Department department;

    @ManyToMany
    @JoinTable(name = "student_taken_section", joinColumns = @JoinColumn(name = "student_id"),
                               inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    @ElementCollection
    @CollectionTable(name = "student_phone_number", joinColumns = @JoinColumn(name = "student_id"))
    private List<String> phoneNumbers;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTotalCredits(double totalCredits) {
        this.totalCredits = totalCredits;
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

    public double getTotalCredits() {
        return totalCredits;
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
