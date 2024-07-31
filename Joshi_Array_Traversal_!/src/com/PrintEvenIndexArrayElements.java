package com;

import java.util.Scanner;

public class PrintEvenIndexArrayElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		evenIndexElementPrinting(ar);
	}
	public static void evenIndexElementPrinting(int[] ar) {
		for(int i=0; i<ar.length; i=i+2) {
			System.out.print(ar[i]+" ");
		}
	}

}
