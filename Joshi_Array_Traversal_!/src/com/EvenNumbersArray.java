package com;

import java.util.Scanner;

public class EvenNumbersArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Array Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		evenElementArray(ar);
	}
	public static void evenElementArray(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}
