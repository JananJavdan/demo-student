package com.example.demo.student.model;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class StudentModel {
    @Id
    //De @SequenceGenerator-annotatie definieert een primaire sleutelgenerator
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String Name;
    private String email;
    private LocalDate dob;

    @Transient
    private Integer age;

    public StudentModel() {
    }


    public StudentModel(String name, String email, LocalDate dob) {
        Name = name;
        this.email = email;
        this.dob = dob;
    }

    public StudentModel(long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        Name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
