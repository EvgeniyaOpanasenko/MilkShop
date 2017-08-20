package com.ua.MilkShop.service;

import com.ua.MilkShop.model.abstractEntity.Product;
import com.ua.MilkShop.repository.ProductGoodsRepository;
import com.ua.MilkShop.service.interfaces.ProductGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductGoodsServiceImpl implements ProductGoodsService {

    @Autowired
    private ProductGoodsRepository repository;

    @Override
    public boolean addNewProduct(Product product) {
        return false;
    }

    @Override
    public boolean removeProduct(Product product) {
        return false;
    }

    @Override
    public List<Product> allProducts() {
        return null;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }
}
