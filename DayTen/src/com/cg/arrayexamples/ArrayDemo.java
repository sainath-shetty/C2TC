package com.cg.arrayexamples;

import java.util.Arrays;

public class ArrayDemo {
public static void main(String[] args)
{
int intArr[]= {10,20,30,45,67,5,2,1,3};
int intArr2[]={10,20,30,45,67,5,2,1,3};
System.out.println(intArr);//get the starting address of the array

System.out.println(Arrays.toString(intArr));//object to string coversion
//for(int i=0;i<intArr.length;i++)
//{
//
//System.out.println(intArr[i]);
//
//}
//sorting
Arrays.sort(intArr);
System.out.println(Arrays.toString(intArr));

//Binary searching

int key=3;
System.out.println(Arrays.binarySearch(intArr,key));

//equals 
System.out.println(Arrays.equals(intArr, intArr2));//compares each element one by one 
Arrays.sort(intArr2);
System.out.println(Arrays.equals(intArr, intArr2));

//copy of the array
int intArr3[]=Arrays.copyOf(intArr2, 10);
System.out.println(Arrays.toString(intArr3));

//filling with the particyuular valie to the array
Arrays.fill(intArr3, 22);
System.out.println(Arrays.toString(intArr3));
}

}
