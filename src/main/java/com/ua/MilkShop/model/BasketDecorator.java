package com.ua.MilkShop.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasketDecorator extends Item {

    public abstract String getDescription();
}
