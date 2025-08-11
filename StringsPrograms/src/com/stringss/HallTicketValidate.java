package com.stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HallTicketValidate {
	public static void main(String[] args) {
    
      
          Scanner sc= new Scanner(System.in);

		System.out.println("enter hallticket");
		String s=sc.next();
     
      System.out.println(s.matches("DS[0-9]{4}"));//DSxxxx
	}
}
