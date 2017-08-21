package com.ua.MilkShop;

import com.ua.MilkShop.model.Basket;
import com.ua.MilkShop.model.Item;
import com.ua.MilkShop.model.PurchaseOrder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MilkShopApplication {

	public static void main(String[] args) {

		SpringApplication.run(MilkShopApplication.class, args);

		Item basket = new Basket(0);

		basket = new PurchaseOrder(basket, "Apple", 12, 2);
		basket = new PurchaseOrder(basket, "Melon", 0.5, 5);
		basket = new PurchaseOrder(basket, "Tomato", 2, 12);
		basket = new PurchaseOrder(basket, "Cucumber", 0.3, 22);

		System.out.println(basket.getDescription() + basket.cost());
	}
}
