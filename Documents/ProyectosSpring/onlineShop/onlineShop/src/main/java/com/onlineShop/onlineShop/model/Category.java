package com.onlineShop.onlineShop.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "category_id")
    private Integer id;
    @Column (name = "type", nullable = false, unique = true)
    private String type;
    @Column(name = "description")
    private String description;

    public Category() {
    }

    public Category(Integer id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
