package com.stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateVAlidate {
	public static void main(String[] args) {
    
      
          Scanner sc= new Scanner(System.in);

		System.out.println("enter date");
		String s=sc.nextLine();
     
      System.out.println(s.matches("[0-3][0-9]-[0-1][0-9]-202[3-9]"));//31-12-2023
	}
}
