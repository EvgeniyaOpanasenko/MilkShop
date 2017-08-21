/*
package com.ua.MilkShop.model;

import com.ua.MilkShop.model.goods.ItemGoods;

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
    private ItemGoods goods;

    private double capacity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basket_id", referencedColumnName = "id")
    private Basket basket;

    private double totalOfPurchaseOrder;

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

    public ItemGoods getGoods() {
        return goods;
    }

    public void setGoods(ItemGoods goods) {
        this.goods = goods;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getTotalOfPurchaseOrder() {
        return totalOfPurchaseOrder;
    }

    public void setTotalOfPurchaseOrder(double totalOfPurchaseOrder) {
        this.totalOfPurchaseOrder = totalOfPurchaseOrder;
    }
}
*/
