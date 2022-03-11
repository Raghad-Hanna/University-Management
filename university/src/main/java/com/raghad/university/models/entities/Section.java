package com.raghad.university.models.entities;

import javax.persistence.*;
import java.time.LocalTime;

import com.raghad.university.models.enums.Day;
import com.raghad.university.models.enums.Semester;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Enumerated(EnumType.ORDINAL)
    private Day day;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
    private Semester semester;

    private String year;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Classroom classroom;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public int getID() {
        return ID;
    }

    public Semester getSemester() {
        return semester;
    }

    public String getYear() {
        return year;
    }

    public Course getCourse() {
        return course;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}
