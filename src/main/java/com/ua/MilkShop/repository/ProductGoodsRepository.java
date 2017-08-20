package com.ua.MilkShop.repository;

import com.ua.MilkShop.model.goods.ProductGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductGoodsRepository extends JpaRepository<ProductGoods, Long>{
}
