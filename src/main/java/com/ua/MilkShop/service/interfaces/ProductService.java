package com.ua.MilkShop.service.interfaces;

import com.ua.MilkShop.model.abstractEntity.Product;

import java.util.List;

/**
 * Created by User on 8/20/2017.
 */
public interface ProductService {
    boolean addNewProduct(Product product);
    boolean removeProduct(Product product);
    List<Product> allProducts();
    boolean updateProduct(Product product);
}
