package com.stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidate {
	public static void main(String[] args) {
    
      
          Scanner sc= new Scanner(System.in);

		System.out.println("enter number");
		String s=sc.next();
     
      System.out.println(s.matches("[6-9][0-9]{9}"));//0-9 only 4 digits
	}
}
