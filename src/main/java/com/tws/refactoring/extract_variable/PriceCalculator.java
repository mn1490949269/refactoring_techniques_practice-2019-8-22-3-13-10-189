package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    double getPrice(int quantity, int itemPrice) {
    	double price;
        // Price consists of: base price - discount + shipping cost
    	//base price
    	double basePrice = quantity * itemPrice;
    	//discount
    	double discount = Math.max(0, quantity - 500) * itemPrice * 0.05;
    	//shippingCost
    	double shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);
    	price = basePrice - discount + shippingCost;
        return price;
    }
}
