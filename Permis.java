package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class Permis {

	public static void main(String[] args) {

		System.out.println("The user home is :"+System.getProperty("user.home"));

		try {
			Scanner scObj = new Scanner(new File("C:\\Users\\Arulmozhi\\input.txt"));

			int no1 = scObj.nextInt();

			int no2 = scObj.nextInt();

			System.out.println("The 2 nos are :" + no1 + " , " +no2);

			Formatter outObj = new Formatter(new File("C:\\Users\\Arulmozhi\\output.txt"));

			int total = no1 + no2;

			System.out.println("The total is :" + total);

			outObj.format("%d", total);

			outObj.close();

		} catch (FileNotFoundException e) {

			System.out.println(e.toString());
		}

	}

}

/* Output */
/*
 * It reads the 2 numbers in the input file , add it and print the sum up value
 * in output file
 */

