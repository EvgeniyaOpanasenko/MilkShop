package com.ua.MilkShop.model;

import javax.persistence.*;

@Entity
@Table(name = "purchase_orders")
public class PurchaseOrder extends BasketDecorator {

    @Transient
    private Item item;
    private String name;
    private double quantity;
    private double price;
    private double total = 0;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "basket_id", referencedColumnName = "id")
    private Basket basket;

    public PurchaseOrder() {
    }

    public PurchaseOrder(Item item, String name, double quantity, double price) {
        this.item = item;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = cost();
    }

    //TODO part of decorator move to service
    @Override
    public double cost() {
        return price * quantity + item.cost();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " " + name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
