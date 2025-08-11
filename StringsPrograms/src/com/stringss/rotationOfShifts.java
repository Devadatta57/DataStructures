package com.stringss;

import java.util.Arrays;
import java.util.Scanner;
//s=abcde then abcdeabcde contains all poss rotations of ss(same length as s) if yes true else false  
public class rotationOfShifts {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
           String s=sc.nextLine();
           System.out.println("Enter String: ");
           String ss=sc.nextLine();
           System.out.println(s.length()== ss.length() && (s+s).contains(ss));
	}
}
