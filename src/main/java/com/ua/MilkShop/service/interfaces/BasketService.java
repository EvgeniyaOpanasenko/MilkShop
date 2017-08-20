package com.ua.MilkShop.service.interfaces;


import com.ua.MilkShop.model.Basket;
import com.ua.MilkShop.model.UnitOrder;

import java.util.List;

public interface BasketService {
    void addFinalOrder(Basket basket);
    List<Basket> getAllBaskets();

}
