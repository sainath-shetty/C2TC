package com.cg.stringexamples;

public class StringOpertionMethod {
public static void main(String[] args) {
	String s1=new String("  Hel  oooo   ");
	String s2=new String("");
	System.out.println(s1);
	System.out.println(s1.toUpperCase());
	System.out.println(s1.length());
	System.out.println(s1.substring(2,7));
	System.out.println(s1.strip());
	System.out.println(s1.trim());
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	
	char c[]= {'I','N','D','I','A','N'};
	String s3=new String(c);
	System.out.println(s3.toLowerCase());
}
}
