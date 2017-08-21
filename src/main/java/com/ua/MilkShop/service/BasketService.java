package com.ua.MilkShop.service;

import com.ua.MilkShop.model.Basket;
import com.ua.MilkShop.model.PurchaseOrder;


import java.util.List;

public interface BasketService {
    void removePO(PurchaseOrder po);
    List<PurchaseOrder> getAllPObyUser();
    List<Basket> getAllBaskets();

}
