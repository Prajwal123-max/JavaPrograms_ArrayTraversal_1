package com;

import java.util.Scanner;

public class AbsoluteSumArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the sze of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		absoluteSumOfArray(ar);
	}
	public static void absoluteSumOfArray(int[] ar) {
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<0) {
				ar[i]=ar[i]*(-1);
			}
			sum=sum+ar[i];
		}
		System.out.println("Absolute Sum of Array is: "+sum);
	}

}
