//3 3 3 3 3 
//3 2 2 2 3 
//3 2 1 2 3 
//3 2 2 2 3 
//3 3 3 3 3


package com.jka.pattern;

import java.util.Scanner;

public class TheNumberPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		for(int i =target; i >=1; i--) {
			for(int j =target ; j>0 ; j--) {
				System.out.print(Math.max(i, j)+" ");
			}
			for(int k =2 ; k<=target ; k++) {
				System.out.print(Math.max(i, k)+" ");
			}
			System.out.println();
		}
		for(int i =2; i <=target; i++) {
			for(int j =target ; j>0 ; j--) {
				System.out.print(Math.max(i, j)+" ");
			}
			for(int k =2 ; k<=target ; k++) {
				System.out.print(Math.max(i, k)+" ");
			}
			System.out.println();
		}
	}

}
