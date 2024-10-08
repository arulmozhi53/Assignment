package com.example.demo.Restaurant;

import java.util.Comparator;

public class SortbyName implements Comparator<Item> {
	
	@Override
    public int compare(Item e1, Item e2) {
        return e1.getName().compareTo(e2.getName());
    }

	
	

}
