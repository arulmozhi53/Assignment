package com.example.demo;



public class MemoryTest {

	public static void main(String[] args) {

		try
        {
            char[] chars = new char[300000000];
            for (int i=0; i<chars.length; i++) 
            	chars[i] = 'A';
            String str = new String(chars);
            StringBuffer sb = new StringBuffer();
            System.out.println("Now appending str");
            sb.append(str);
            System.out.println("Now appending Hello");
            sb.append("Hello!"); 
          
            System.out.println("Finished!");
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }


	}

}
