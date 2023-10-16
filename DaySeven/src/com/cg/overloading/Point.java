package com.cg.overloading;

public class Point {
	
	//overloading depends on to conditions 
	//type of datatype and no of arguments
	private float x;
	private float y;
	private float z;
	public Point()
	{
		super();
	}
	//constructor 2
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	//constructor 3
	public Point(float y) {
		super();
		this.y = y;
	}
	public Point(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	

}
