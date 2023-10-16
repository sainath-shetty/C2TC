package com.cg.listinterfaceexample;
import java.util.*;

public class Listdemo {
public static void main(String[] args )
{
	List<Student> studentList=new ArrayList<>();
	studentList.add(new Student(11,"Sainath",10.0f));
	studentList.add(new Student(12,"Sampath",9.0f));
	studentList.add(new Student(13,"Sushanth",8.0f));
	studentList.add(new Student(14,"Rathan",7.0f));
	studentList.add(new Student(15,"Sumith",6.0f));
	System.out.println(studentList);
	}
}
