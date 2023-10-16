package com.cg.statickeyword;
class Outer{
	 static int data=10;
	static class Inner{
		void msg() {
			System.out.println(data);
		}
}
}
public class StaticJavaClass {
public static void main(String[] args)
{
	Outer.Inner i=new Outer.Inner();
	Outer.Inner i1=new Outer.Inner();
	Outer o=new Outer();
	o.data=20;
	i.msg();
	i1.msg();
}
}
