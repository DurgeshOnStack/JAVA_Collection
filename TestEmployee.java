package com.collection;
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employee: ");
        int noOfEmployee=sc.nextInt();
        sc.nextLine();
           EmployeeManager e= new EmployeeManager();
        if(noOfEmployee>0){
            for(int i=1;i<=noOfEmployee;i++){
            	 System.out.println("Enter no "+i+" employee: ");
                e.addEmployee(sc.nextLine());
            }
            System.out.println("\nBefore sorting employee: ");
            e.displayEmployees();
            e.sortEmployees();
            System.out.println("\nAfter sorting employee: ");
            e.displayEmployees();
        }
    }
}
class EmployeeManager{
 ArrayList<String>employeesNames=new ArrayList<String>();
 public void addEmployee(String name){
    employeesNames.add(name);
 }
 public void sortEmployees(){
    Collections.sort(employeesNames);
 }
 public void displayEmployees(){
 Iterator <String> i=employeesNames.iterator();
 while(i.hasNext()){
    System.out.println(i.next());
 }
}}