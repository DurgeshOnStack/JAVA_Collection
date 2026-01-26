package com.collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class TestParticipants {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of participants: ");
	ArrayList<String> nameOfParticipants=new ArrayList<String>(); 
	int noOfParticipants=Integer.parseInt(sc.nextLine());
	if(noOfParticipants<=15) {
		for(int i=1;i<=noOfParticipants;i++) {
			System.out.println("\nEnter "+i+" no participant name: ");
			String name=sc.nextLine();
			if(name.length()<=30) {
			nameOfParticipants.add(name);
			System.out.println("Adding....");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+" added.");
		}
			else {
				System.err.println("Error – Participant name too long");
			}
		}
			System.out.println("Name of participants : ");
			Iterator p=nameOfParticipants.iterator();
			while(p.hasNext()) {
				System.out.println(p.next());
			}
			System.out.println("Enter name to remove from list: ");
			String name=sc.nextLine();
			System.out.println("Removing....... "+name);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			nameOfParticipants.remove(name);
			System.out.println("Removed...");
	}
		
	else {
		System.err.println("Maximum 15 participants allowed.");
	}
	System.out.println("\nAfter removing name of total participents: ");
	Iterator p=nameOfParticipants.iterator();
	while(p.hasNext()) {
		System.out.println(p.next());;
	}
	
}
	}

