package com.stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BikeRegNum {
	public static void main(String[] args) {
    
      
          Scanner sc= new Scanner(System.in);

		System.out.println("enter bike");
		String s=sc.nextLine();
     
      System.out.println(s.matches("TS [1-2][0-9] [A-Z]{2} [0-9]{4}"));//TS 13 AZ 1232
	}
}
