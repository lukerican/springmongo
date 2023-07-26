package com.attempt2.springmongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document("collections = students")
public class Student {
    @Id
    private        String ID;
    private String Name;
    private LocalDateTime DOB;
    private String Branch;
    private float GPA;

    public Student(String ID, String Name, LocalDateTime DOB, String Branch, float GPA) {
        this.ID = ID;
        this.Name = Name;
        this.DOB = DOB;
        this.Branch = Branch;
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public LocalDateTime getDOB() {
        return DOB;
    }

    public void setDOB(LocalDateTime DOB) {
        this.DOB = DOB;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        this.Branch = Branch;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
}
