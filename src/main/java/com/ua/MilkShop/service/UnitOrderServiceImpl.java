package com.ua.MilkShop.service;

import com.ua.MilkShop.model.UnitOrder;
import com.ua.MilkShop.repository.UnitOrderRepository;
import com.ua.MilkShop.service.interfaces.UnitOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitOrderServiceImpl implements UnitOrderService {

    @Autowired
    private UnitOrderRepository repository;

    @Override
    public boolean addPurchaseOrder(UnitOrder order) {
        double total = countTotalOfPurchaseOrder(order.getCapacity(),
                order.getGoods().getPricePerUnit());
        order.setTotalOfPurchaseOrder(total);
        repository.save(order);
        return true;
    }

    private double countTotalOfPurchaseOrder(double capacity,
                                             double pricePerUnit) {

        return capacity * pricePerUnit;
    }
}
