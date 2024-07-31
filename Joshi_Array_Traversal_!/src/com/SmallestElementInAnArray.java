package com;

import java.util.Scanner;

public class SmallestElementInAnArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		smallestElementinArray(ar);
	}
	public static void smallestElementinArray(int[] ar) {
		int small=Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(small>ar[i]) {
				small=ar[i];
			}
		}
		System.out.println(small);
	}
}
