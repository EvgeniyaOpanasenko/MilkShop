package com.ua.MilkShop.model.goods;

import com.ua.MilkShop.model.abstractEntity.Product;
import com.ua.MilkShop.model.UnitOrder;
import com.ua.MilkShop.model.enums.UnitOfMeasurement;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "goods")
public class ProductGoods extends Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imagePath;

    @Column(name = "unitOfMeasurement")
    @Enumerated(EnumType.STRING)
    private UnitOfMeasurement unitOfMeasurement;

    @OneToOne(mappedBy = "goods")
    private UnitOrder unitOrder;

    public ProductGoods() {
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

    public UnitOrder getUnitOrder() {
        return unitOrder;
    }

    public void setUnitOrder(UnitOrder unitOrder) {
        this.unitOrder = unitOrder;
    }

    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }
}
