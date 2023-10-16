package com.cg.arrayexamples;

public class ArrayOfObjcets {
public static void main(String[] arr)
{
	int array[]=new int[5];
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	array[4]=50;
	Student a[]=new Student[5];//creating array object of the student
    a[0]=new Student(1,"Sainath");
    a[1]=new Student(2,"Sushanth");
    a[2]=new Student(3,"Sush");
    a[3]=new Student(4,"hanth");
    a[4]=new Student(5,"shahanth");
}
}
