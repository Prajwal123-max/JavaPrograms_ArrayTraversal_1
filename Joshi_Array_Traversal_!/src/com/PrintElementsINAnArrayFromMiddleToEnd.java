package com;

import java.util.Scanner;

public class PrintElementsINAnArrayFromMiddleToEnd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		printingElementsFromMiddleToEnd(ar);
	}
	public static void printingElementsFromMiddleToEnd(int[] ar) {
		for(int i=ar.length/2; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
