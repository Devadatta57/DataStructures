package com.stringss;

import java.util.StringTokenizer;

public class Strings2 {
	public static void main(String[] args) {
//     String s = new String("deva");
//     System.out.println("deva".isEmpty());
//     System.out.println("".isEmpty());
//     System.out.println(" t".isBlank());
//     System.out.println("deva".equals("Deva"));
//     System.out.println("deva".equalsIgnoreCase("Deva"));
//     System.out.println(s.charAt(3));
//     System.out.println(s.contains("e"));
//     System.out.println(s.startsWith("De"));
//     System.out.println(s.startsWith("de"));
//     System.out.println(s.endsWith("a"));
//     System.out.println("adad".lastIndexOf("d"));
//     System.out.println("wqe".indexOf("c"));
//     System.out.println(s.compareTo("devaf"));
//     System.out.println(s.concat("Deadasd"));
//		char[] c="sadasd".toCharArray();
//		System.out.println(c);
//	     System.out.println(s.substring(1,4));
//	     System.out.println(s.toUpperCase("Deadasd"));

     
//     StringBuffer d = new StringBuffer();
//     System.out.println(d);
//     System.out.println(d.capacity());
//     
//     
//     StringBuffer d1 = new StringBuffer("deva");
//     System.out.println(d1);
//     System.out.println(d1.capacity());//(old capacity+1)*2
//     System.out.println(d1.append(" datta"));
//     System.out.println(d1.substring(1,5));
    // System.out.println(d1.deleteCharAt(3));
   //  System.out.println(d1.delete(3, 5));
   //  System.out.println(d1.insert(2, "oo"));
		
//		String s= new String("java dirt lang");
//		StringTokenizer t = new StringTokenizer(s);
//		System.out.println(t.countTokens());
//		while(t.hasMoreTokens()) {
//			System.out.println(t.nextToken());
//		}
		
//		String s1= new String("23:34:34");
//		StringTokenizer t1 = new StringTokenizer(s1,":");
//		System.out.println(t1.countTokens());
//		while(t1.hasMoreTokens()) {
//			System.out.println(t1.nextToken());
//		}
		
		String s1= new String("23-34-34");
		StringTokenizer t1 = new StringTokenizer(s1,"-");
		System.out.println(t1.countTokens());
		while(t1.hasMoreTokens()) {
			System.out.println(t1.nextToken());
		}
	}
}
