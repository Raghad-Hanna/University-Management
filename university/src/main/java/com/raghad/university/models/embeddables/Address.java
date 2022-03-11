package com.raghad.university.models.embeddables;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;

    private int street;

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public int getStreet() {
        return street;
    }
}
