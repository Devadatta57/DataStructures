package com.stringss;

public class Pangram {
	public static void main(String[] args) {
       String s="abcdefghijkmnopqrstuvwxyz";
       boolean flag=true;
       for(int i='a';i<='z';i++) {
    	   if(s.indexOf(i)<0) {
    		   flag=false;
    		   break;
    	   }
       }
       System.out.println(flag);
       
	}
}
