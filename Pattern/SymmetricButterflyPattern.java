//*    *
//**  **
//******
//**  **
//*    *



package com.jka.pattern;

import java.util.Scanner;

public class SymmetricButterflyPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		
		for(int i=0; i < target ; i++) {
			for(int j = 0 ; j < target ; j ++) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int k=target-1 ; k >=0 ; k--) {
				if(k<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=target-1; i > 0 ; i--) {
			for(int j = 1 ; j <= target ; j ++) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int k=target ; k >0 ; k--) {
				if(k<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
