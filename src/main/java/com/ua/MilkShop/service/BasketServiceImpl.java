package com.ua.MilkShop.service;

import com.ua.MilkShop.model.Basket;
import com.ua.MilkShop.model.UnitOrder;
import com.ua.MilkShop.repository.BasketRepository;
import com.ua.MilkShop.repository.UnitOrderRepository;
import com.ua.MilkShop.service.interfaces.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Service
public class BasketServiceImpl extends Observable implements BasketService {

    private List<UnitOrder> orders;
    private UnitOrder unitOrder;
    private String name;
    private double capacity;
    private double total;


    @Autowired
    private BasketRepository repository;

    @Autowired
    private UnitOrderRepository unitOrderRepository;

    // after this system must notify smsSender about finalizing order
    @Override
    public void addFinalOrder(Basket basket) {
        double total = countTotal(orders);
        basket.setTotal(total);
        repository.save(basket);
        setChanged();
        notifyObservers();
    }

    @Override
    public List<Basket> getAllBaskets() {
        return null;
    }

    //TODO get list of orders and get Total sum of basket
    private double countTotal(List<UnitOrder> orders) {
        return 0;
    }

    @Override
    public synchronized void addObserver(Observer o) {

        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {

        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {

        super.notifyObservers(arg);
    }

    @Override
    public synchronized void deleteObservers() {

        super.deleteObservers();
    }

    @Override
    protected synchronized void setChanged() {

        super.setChanged();
    }

    @Override
    protected synchronized void clearChanged() {

        super.clearChanged();
    }

    @Override
    public synchronized boolean hasChanged() {

        return super.hasChanged();
    }

}
