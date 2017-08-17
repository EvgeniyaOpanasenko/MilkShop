package com.ua.MilkShop.repository;

import com.ua.MilkShop.model.UnitOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitOrderRepository extends JpaRepository<UnitOrder, Long> {
}
