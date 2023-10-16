package com.cg.stringexamples;

public class StringBUfferDemo {
public static void main(String[] args) {
	
	//immutable
	String n1=new String("Study");
	n1.concat("night");
	System.out.println(n1);
	
	//mutable
	StringBuffer sb1=new StringBuffer(100);
	System.out.println(sb1.capacity());
	StringBuffer sb=new StringBuffer("");
	System.out.println(sb.capacity());//16
	sb.append("Night is very darker");
	System.out.println(sb);
	System.out.println(sb.capacity());//16*2+2=34
	sb.append("Night is very dark"); 
	System.out.println(sb.capacity());//34*2+2=70
	sb.ensureCapacity(100);//70*2+2=142
	System.out.println(sb.capacity());
}
}
