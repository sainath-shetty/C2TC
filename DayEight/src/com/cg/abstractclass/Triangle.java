package com.cg.abstractclass;
//Concrete class
public class Triangle extends Shape{
	float base;
	float height;
	
	void calcArea() {
	//to access the abstract class variable we must use super keyword
		super.area=(float)0.5*base*height;
	}

}
