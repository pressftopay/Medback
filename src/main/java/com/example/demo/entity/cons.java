package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cons")
public class cons {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ID;
    private String c_name;
    private String phone;

    private String questions;
    private boolean ischecked;

    public cons(Long ID, String c_name, String phone,  String questions, boolean ischecked) {
        this.ID = ID;
        this.c_name = c_name;
        this.phone = phone;

        this.questions = questions;
        this.ischecked = ischecked;
    }

    public cons() {

    }



    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String name) {
        this.c_name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public boolean isChecked() {
        return ischecked;
    }

    public void setChecked(boolean checked) {
        this.ischecked = checked;
    }
}
