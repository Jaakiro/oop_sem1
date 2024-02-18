package org.example.sem1.z2;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine{
    List<Product> hotDrinksList = new ArrayList<>();


    @Override
    public void initProducts(List<Product> list) {

    }

    @Override
    public Product getProduct(String name, int cost, double volume) {
        for(Product hotDrink : hotDrinksList){
            if(hotDrink.getName().equals(name) && hotDrink.getCost() == cost)
                return hotDrink;
        }
        return null;
    }
}
