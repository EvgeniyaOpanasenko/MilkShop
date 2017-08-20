package com.ua.MilkShop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "baskets")
public class Basket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // currently logged in/ can be empty
    //one session can hols only one logged in user
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserDto userDto;

    //TODO work on mistake Mapping UnitOrder=>Basket
    @OneToMany(mappedBy = "basket")
    private List<UnitOrder> orders;

    //TODO add delivery type

    // all orders Sum
    private double total;
    private Date orderDate;

    public Basket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public List<UnitOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<UnitOrder> orders) {
        this.orders = orders;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
