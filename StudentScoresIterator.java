package com.collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class StudentScoresIterator {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no students: ");
	int numStudents=sc.nextInt();
	ArrayList<ArrayList<Integer>> studentScores=new ArrayList();
	if(numStudents<=50) {
		for(int i=1;i<=numStudents;i++) {
			ArrayList<Integer> student=new ArrayList<Integer>();
			System.out.println("Enter no of score :");
			int numScores=sc.nextInt();
			if(numScores<=5) {
				for(int j=1;j<=numScores;j++) {
					System.out.println("Enter score "+j);
					int score=sc.nextInt();
					student.add(score);
					System.out.println("Student score Addiding...");
					
					System.out.println("Score Added.");
				}
				studentScores.add(student);
				
			}
			else {
				System.out.println("Enter Scores between 0 and 100.");
			}
		}
	}
	else {
		System.out.println("Only 50 students are allowed.");
	}
	int i=1;
	Iterator<ArrayList<Integer>> outeriterator=studentScores.iterator();
	while(outeriterator.hasNext())
	{
		System.out.println("Student "+i);
		ArrayList<Integer> student=outeriterator.next();
		Iterator<Integer> innerIterator=student.iterator();
		while(innerIterator.hasNext())
		{
			System.out.println("student score: "+innerIterator.next());
			
		}
		i++;
	}
	
}
}
