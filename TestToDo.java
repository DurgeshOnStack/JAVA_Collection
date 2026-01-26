package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestToDo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> toDo = new ArrayList<String>();
		System.out.println("Enter number of tasks: ");
		int noOfTask = Integer.parseInt(sc.nextLine());
		if (noOfTask <= 10) {

			for (int i = 1; i <= noOfTask; i++) {
				System.out.println(i + " Enter task :");
				String task = sc.nextLine();
				if (task.length() < 50) {
					toDo.add(task);
				} 
				else
				{
					System.err.println("Task length is too long!");
				}
			}
			
			
			Iterator it=toDo.iterator();
			
			System.err.println("ALL Tasks");
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			

		} 
		else
		{
			System.out.println("Error – Maximum 10 tasks allowed");
		}

	}
}
