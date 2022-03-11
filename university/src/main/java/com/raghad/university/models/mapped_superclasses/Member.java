package com.raghad.university.models.mapped_superclasses;

import com.raghad.university.models.embeddables.Address;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class Member {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Embedded
    private Address address;

    @Column(name = "created_at")
    private LocalDate creationDate;

    @Column(name = "last_updated")
    private LocalDate updateDate;

    @PostPersist
    public void saveMemberRegistrationDate() {
        LocalDate now = LocalDate.now();
        this.creationDate = now;
        this.updateDate = now;
    }

    @PostUpdate
    public void saveMemberModificationDate() {
        this.updateDate = LocalDate.now();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return this.address;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }
}
