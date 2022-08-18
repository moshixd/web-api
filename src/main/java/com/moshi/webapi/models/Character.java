package com.moshi.webapi.models;

import javax.persistence.*;

@Entity
@Table(name="character")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String full_name;

    @Column(name = "alias", nullable = false)
    private String alias;

    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @Column(name = "id", nullable = true)
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
