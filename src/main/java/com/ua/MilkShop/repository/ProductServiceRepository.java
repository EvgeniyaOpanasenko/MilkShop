package com.ua.MilkShop.repository;

import com.ua.MilkShop.model.services.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepository extends JpaRepository<ProductService, Long>{
}
