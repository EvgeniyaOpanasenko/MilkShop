package com.ua.MilkShop.service.interfaces;

import com.ua.MilkShop.model.Basket;
import com.ua.MilkShop.model.PurchaseOrder;
import com.ua.MilkShop.model.UserDto;
import com.ua.MilkShop.repository.BasketRepository;
import com.ua.MilkShop.repository.PurchaseOrderRepository;
import com.ua.MilkShop.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Service
public class BasketServiceImpl extends Observable implements BasketService {

    private List<PurchaseOrder> orders;
    private PurchaseOrder purchaseOrder;
    private String name;
    private double capacity;
    private double total;

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

    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    private UserDto loggedInUser;

    @Override
    public void removePO(PurchaseOrder po) {
        purchaseOrderRepository.delete(po);
    }

    @Override
    public List<PurchaseOrder> getAllPObyUser() {
        return null;
    }

    @Override
    public List<Basket> getAllBaskets() {
        return basketRepository.findAll();
    }
}
