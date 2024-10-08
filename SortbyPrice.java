package com.example.demo.Restaurant;

import java.util.Comparator;

public class SortbyPrice implements Comparator<Item> {
	
	@Override
    public int compare(Item e1, Item e2) {
        return e1.getPrice()- e2.getPrice();
    }

	
	

}
