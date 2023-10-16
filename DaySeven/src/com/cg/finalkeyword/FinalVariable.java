package com.cg.finalkeyword;

public class FinalVariable {
	int a=60;//this can be changed as it is not a final variable
	final int value=200; //this cannot be changes as it s a final variable
	public static void main(String[] args)
	{
		FinalVariable f=new FinalVariable();
		f.a=100;
		System.out.println(f.a);
		
//		f.value=250;
//		System.out.println(f.value);
		//this throws an error
		
	}

}
