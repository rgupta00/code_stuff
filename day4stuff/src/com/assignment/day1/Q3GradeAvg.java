package com.assignment.day1;

import java.util.Scanner;

/*
 *Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the
grades of each of the students and saves them in an int array called grades.
 */
public class Q3GradeAvg {

	public static void main(String[] args) {
		
		System.out.println("PE no of students");
		Scanner scanner=new Scanner(System.in);
		int noOfStudents=scanner.nextInt();
		int marks;
		int sumOfAllMarks=0;
		
		int x[]=new int[noOfStudents];
		
		for(int counter=0;counter< noOfStudents ; counter++) {
			System.out.println("PE marks of "+ (counter+1)+" students");
			marks=scanner.nextInt();
			
			if(marks<0 || marks >100) {
				System.out.println("PE marks in correct rangle ie 0 - 100");
				counter--;
				continue;
			}
			sumOfAllMarks+=marks;
		}
		
		System.out.println("sum of marks of "+noOfStudents+" is equals to "+ sumOfAllMarks);
		
	}

	
}
