package com;

import java.util.Scanner;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		largestElementOfArray(ar);
	}
	public static void largestElementOfArray(int[] ar) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max){
				max=ar[i];
			}
		}
		System.out.println(max);
	}

}
