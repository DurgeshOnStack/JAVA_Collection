package com.collection;
import java.util.*;
public class RemoveDuplicatesFromArrayList {
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 ArrayList<Integer>list1=new ArrayList<Integer>();
 ArrayList<Integer>list2=new ArrayList<Integer>();
 System.out.println("Enter no of element: ");
 int no=sc.nextInt();
 if(no>0){
 for(int i=1;i<=no;i++){
	System.out.println("Enter "+i+" element: "); 
 list1.add(sc.nextInt());
 }
 System.out.println("Original ArrayList: "+list1);
 Collections.sort(list1);
 for(int i=0;i<no;i++){
 int a=list1.get(i);
 if(!(list2.contains(a))){
 list2.add(a);
 }
 }
 }
 System.out.println("ArrayList after removing duplicates: "+list2);
 }
}
