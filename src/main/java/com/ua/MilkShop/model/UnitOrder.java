package com.ua.MilkShop.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "unit_orders")
public class UnitOrder implements Serializable{

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private double capacity;

    @ManyToOne(cascade = CascadeType.PERSIST)
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }


}
