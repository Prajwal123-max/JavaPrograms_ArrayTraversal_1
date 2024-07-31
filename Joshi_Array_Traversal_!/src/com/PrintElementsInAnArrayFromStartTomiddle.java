package com;

import java.util.Scanner;

public class PrintElementsInAnArrayFromStartTomiddle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		elementsFromStartToMiddle(ar);
	}
	
	public static void elementsFromStartToMiddle(int[] ar) {
		for(int i=0; i<ar.length/2; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
