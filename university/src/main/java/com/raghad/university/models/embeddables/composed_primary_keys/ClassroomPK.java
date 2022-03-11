package com.raghad.university.models.embeddables.composed_primary_keys;

import javax.persistence.Embeddable;
import javax.persistence.Column;
import java.io.Serializable;

@Embeddable
public class ClassroomPK implements Serializable {
    @Column(nullable = false)
    private String building;

    @Column(nullable = false)
    private int roomNumber;

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBuilding() {
        return building;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
