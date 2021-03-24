package com.assignment.day1;

import java.util.Scanner;

/*
 * Write a program called TimeTable to produce the multiplication table of 1 to 9 as shown using
two nested for-loops
 */
public class Q2MutiplicationTable {

	public static void main(String[] args) {
		System.out.println("PE no of terms");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		printMultiplicationTable(n);
		scanner.close();//dont forget to close the stream
	}

	
	
	
	public static void printMultiplicationTable(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
