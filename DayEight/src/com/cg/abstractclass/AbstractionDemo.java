package com.cg.abstractclass;

public class AbstractionDemo {
public static void main(String[] args) {
	Triangle t=new Triangle();
	t.base=5;
	t.height=6;
	t.calcArea();
	t.show();
	Circle c=new Circle();
	c.radius=10;
	c.calcArea();
	c.show();
	
}
}
