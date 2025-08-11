package com.stringss;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
            String s1="heart";
            String s2="earth";
            String s3="erath";

            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            char[] ch3=s3.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            Arrays.sort(ch3);

            if(Arrays.equals(ch1,ch2) && Arrays.equals(ch1,ch3)) {
            	System.out.println("anagram");
            }
            else {
            	System.out.println("not");
            }
	}
}
