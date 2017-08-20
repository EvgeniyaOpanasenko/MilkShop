package com.ua.MilkShop.model.services;

import com.ua.MilkShop.model.abstractEntity.Product;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "services")
public class ProductService extends Product implements Serializable{
    //TODO Add portfolio

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
