package com.ua.MilkShop.model;

import com.ua.MilkShop.model.goods.ProductGoods;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "unit_orders")
public class UnitOrder implements Serializable{

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "goods_id")
    private ProductGoods goods;

    private double capacity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basket_id", referencedColumnName = "id")
    private Basket basket;

    public UnitOrder() {
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductGoods getGoods() {
        return goods;
    }

    public void setGoods(ProductGoods goods) {
        this.goods = goods;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }


}
