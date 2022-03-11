package com.raghad.university.models.entities;

import javax.persistence.Entity;
import javax.persistence.EmbeddedId;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;

import com.raghad.university.models.embeddables.composed_primary_keys.ClassroomPK;

@Entity
public class Classroom {
    @EmbeddedId
    @AttributeOverride(name = "roomNumber", column = @Column(name = "room_number"))
    private ClassroomPK ID;

    private int capacity;

    public void setID(ClassroomPK ID) {
        this.ID = ID;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ClassroomPK getID() {
        return this.ID;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
