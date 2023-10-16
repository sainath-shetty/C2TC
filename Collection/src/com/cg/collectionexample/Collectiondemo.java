package com.cg.collectionexample;
import java.util.ArrayList;
import java.util.Collection;
public class Collectiondemo {
public static void main(String [] args) {
	Collection list =new ArrayList();
	list.add(10);
	list.add("Sainath");
	list.add(2,5);
    System.out.println(list);
}
}
