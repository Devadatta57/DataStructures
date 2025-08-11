package com.stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailValidate {
	public static void main(String[] args) {
    
      
          Scanner sc= new Scanner(System.in);

		System.out.println("enter gmail");
		String s=sc.next();
     
      System.out.println(s.matches("[a-z][a-z0-9_][a-z0-9_]+@gmail[.]com"));//0-9 only 4 digits
	}
}
