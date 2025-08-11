package com.stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtmPinValidate {
	public static void main(String[] args) {
    
      
          Scanner sc= new Scanner(System.in);

		System.out.println("enter pin");
		String s=sc.next();
     
      System.out.println(s.matches("[0-9]{4}"));//0-9 only 4 digits
	}
}
