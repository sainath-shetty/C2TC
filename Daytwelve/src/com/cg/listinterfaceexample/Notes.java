package com.cg.listinterfaceexample;
import java.util.*;
public class Notes {
	//list interface 
	//1.Order of insertion 
	//2.Duplicate Element
	//3.NUll Elements
	//4.Index-based
	//5.Implementable class-Arraylist,linkedlist,vector
	public static void main(String[] args) {
	LinkedList<Integer>ll=new LinkedList<>();
    ll.add(130);	
    ll.addLast(100);
    ll.addFirst(30);
    ll.add(1,20);
    System.out.println(ll);
    
    Iterator<Integer>i=ll.iterator();
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
	}

}
