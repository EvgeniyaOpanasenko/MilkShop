package com.ua.MilkShop.service;

import com.ua.MilkShop.service.interfaces.SmsSender;
import org.springframework.stereotype.Service;

import java.util.Observable;
import java.util.Observer;

@Service
public class SmsSenderImpl implements SmsSender, Observer {

    private String phoneUser;
    private String goodsName;
    private double quantity;
    private double totalPrice;
    private Observable observable;

    public SmsSenderImpl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void sendSmsToAdmin() {
        System.out.println("Sms to admin is sent with order details");
    }


    //TODO there are going to be more then one PO in the same Basket
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof BasketServiceImpl) {
            BasketServiceImpl basketService = (BasketServiceImpl) o;
            //this.goodsName = basketService.getProduct().getName();
            //this.quantity = basketService.
        }
    }
}
