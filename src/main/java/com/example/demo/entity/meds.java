package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "meds")
public class meds {
    @Id
    @Column(name = "ID", nullable = false)
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    private Long ID;
    @Column(name = "name")
    private String name;
    private String price;
    private String apteka;
    private String address;
    private String recepie;
    private String analogue;
    private String category;




    private Long popularity;

    public meds(String name, String price, String apteka, String address, String recepie, String analogue, String category,Long ID,Long popularity) {
        this.name = name;
        this.price = price;
        this.apteka = apteka;
        this.address = address;
        this.recepie = recepie;
        this.analogue = analogue;
        this.category = category;
        this.ID = ID;
        this.popularity = popularity;
    }

    public meds() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getApteka() {
        return apteka;
    }

    public void setApteka(String apteka) {
        this.apteka = apteka;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRecepie() {
        return recepie;
    }

    public void setRecepie(String recepie) {
        this.recepie = recepie;
    }

    public String getAnalogue() {
        return analogue;
    }

    public void setAnalogue(String analogue) {
        this.analogue = analogue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long id) {
        this.ID = id;
    }
    public Long getPopularity() {
        return popularity;
    }

    public void setPopularity(Long popularity) {
        this.popularity = popularity;
    }
}
