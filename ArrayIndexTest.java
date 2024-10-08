package com.example.demo;



public class ArrayIndexTest {

	public static void main(String[] args) {

		try {
			int k = 0;
			do {

				System.out.println("Value of input is :" + k + "and args " + args[k++]);
			} while (true);
		} catch (ArrayIndexOutOfBoundsException exception) {

			System.err.println("error occured : " + exception.toString());

		}

	}

}


//Suggestions

//Try catch can be followed by final block
//System.out.println can be replaced by logger statements





