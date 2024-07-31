package com;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		averageOfArray(ar);
	}
	public static void averageOfArray(int[] ar) {
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			sum=sum+ar[i];
		}
		float avg=(sum/ar.length);
		System.out.println("Average of Array: "+avg);
	}

}
