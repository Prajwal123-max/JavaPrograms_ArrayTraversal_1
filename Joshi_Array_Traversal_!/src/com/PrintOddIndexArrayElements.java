package com;

import java.util.Scanner;

public class PrintOddIndexArrayElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		oddIndexElemenstPrinting(ar);
	}
	public static void oddIndexElemenstPrinting(int[] ar) {
		for(int i=1; i<ar.length; i=i+2) {
			System.out.println(ar[i]+" ");
		}
	}

}