package com.ua.MilkShop.model;

import javax.persistence.*;
import java.io.Serializable;
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
    private List<UnitOrder> unitOrders;

    //TODO add delivery type

    // all unitOrders Sum
    private double total;
    private Date orderDate;

    //TODO need to mark no closed orders and to get out of them list of purchase orders
    // now is false => going to be changed to true when admin mark over!
    private boolean status;

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

    public List<UnitOrder> getUnitOrders() {
        return unitOrders;
    }

    public void setUnitOrders(List<UnitOrder> unitOrders) {
        this.unitOrders = unitOrders;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
