package com.ua.MilkShop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imagePath;
    private String name;
    private String description;
    private long pricePerUnit;
    private Date creationDate;

    @OneToOne(mappedBy = "product")
    private UnitOrder unitOrder;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(long pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public UnitOrder getUnitOrder() {
        return unitOrder;
    }

    public void setUnitOrder(UnitOrder unitOrder) {
        this.unitOrder = unitOrder;
    }
}
