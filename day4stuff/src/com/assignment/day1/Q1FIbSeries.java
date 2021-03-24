package com.assignment.day1;

import java.util.Scanner;

public class Q1FIbSeries {

	public static void main(String[] args) {
		System.out.println("PE no of terms");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=getSumFib(n);
		System.out.println("---sum-----");
		System.out.println(sum);
	}

	public static int getSumFib(int n) {
		int sum = 2;
		int a, b, c;
		a = 1;
		b = 1;
		System.out.print(a + " " + b);
		for (int i = 1; i <=(n-2); i++) {
			c = a + b;
			sum += c;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		System.out.println();
		return sum;
	}
}
