package com.cg.overloading;

public class OverloadingDemo {
	public static void main(String[] args) {
		
		
		Point p1=new Point();
		Point p2=new Point(2.0f,3.0f,5.0f);
		System.out.println(p2);
System.out.println(MethodOverloading.addition(10,20));
System.out.println(MethodOverloading.addition(10.5,30.0));
System.out.println(MethodOverloading.addition(10,30,30));
System.out.println(MethodOverloading.addition(10.5f,30.5f,30.5f));
	}

	
}
