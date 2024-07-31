package com;

import java.util.Scanner;

public class PrintProductOfElementsInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		productOfArrayElements(ar);
	}
	public static void productOfArrayElements(int[] ar) {
		long pro=1;
		for(int i=0; i<ar.length; i++) {
			pro=pro*ar[i];
		}
		System.out.println(pro);
	}

}
