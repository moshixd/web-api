package com.moshi.webapi.models;

import javax.persistence.*;


@Entity
@Table(name="CHARACTER")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String full_name;
    private String alias;
    private enum Gender{
        MALE, FEMALE, NONBINARY
    }
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Long getId() {
        return id;
    }
    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
