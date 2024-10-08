package com.example.demo.Restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RestaurantMenu {

	public static void main(String[] args) {
		
		ArrayList<Item> arrayList = new ArrayList<Item>();
		arrayList.add(new Item(100,"VegPizza",3000, "veg"));
		arrayList.add(new Item(101,"Burger",100, "nonveg"));
		arrayList.add(new Item(102,"Coffee",4000, "nonveg"));
		arrayList.add(new Item(103,"Donuts",1200, "nonveg"));
		arrayList.add(new Item(104,"Veg Sandwitch",500, "veg"));
		arrayList.add(new Item(105,"NonvegPizza",3000, "nonveg"));

        
        //Sorted list
		System.out.println("SortbyCategory Menu Items");
        Collections.sort(arrayList, new SortbyCategory());
        for (int i=0; i<arrayList.size(); i++)
            System.out.println(arrayList.get(i));
        
        
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter sorted option :");

		String option = scObj.nextLine();


		System.out.println("Sorted by :" + option );
		
        if(option.equals("SortbyPrice")) {
        	 //SortbyPrice
            System.out.println("SortbyPrice Items");
            Collections.sort(arrayList, new SortbyPrice());
            for (int i=0; i<arrayList.size(); i++)
                System.out.println(arrayList.get(i));
        	
        }
       
        
        if(option.equals("SortbyName")) {
        //SortbyName
        System.out.println("Sortby Nmaes Items");
        Collections.sort(arrayList, new SortbyName());
        for (int i=0; i<arrayList.size(); i++)
            System.out.println(arrayList.get(i));
        
        
        }
        
        scObj.close();
		
	}
		
	}


