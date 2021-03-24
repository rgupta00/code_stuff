package com.assignment.day1;

import java.util.Arrays;

public class Q4CopyArray {

	public static void main(String[] args) {
		int arr[]= {23,56,90};
		
		System.out.println("printing original array");
		printArray(arr);
		
		int copy[]=copyArray(arr);
		System.out.println("printing copy of array");
		
		printArray(copy);
		
		
	}

	public static void printArray(int[] arr) {
		for(int temp: arr) {
			System.out.print(temp+" ");
		}
		System.out.println();
	}

	 static int[] copyArray(int[] arr) {
		 
//		int arrTemp[]=new int[arr.length];
//		//need to copy element one by one from arr to arrTemp
//		for(int i=0;i<arr.length; i++) {
//			arrTemp[i]=arr[i];
//		}
		return Arrays.copyOf(arr, arr.length);
	}
}









