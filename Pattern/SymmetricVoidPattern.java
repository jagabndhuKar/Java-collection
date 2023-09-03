//******
//**  **
//*    *
//*    *
//**  **
//******

package com.jka.pattern;

import java.util.Scanner;

public class SymmetricVoidPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		for(int i =target ; i>0 ; i--) {
			for(int j =1 ; j<=target ; j++) {
				if(j<=i) {
					System.err.print('*');
				}else {
					System.err.print(" ");
				}
			}
			for(int j =target ; j>0 ; j--) {
				if(j<=i) {
					System.err.print('*');
				}else {
					System.err.print(" ");
				}
			}
			System.err.println();
		}
		
		for(int i =1 ; i<=target ; i++) {
			for(int j =1 ; j<=target ; j++) {
				if(j<=i) {
					System.err.print('*');
				}else {
					System.err.print(" ");
				}
			}
			for(int j =target ; j>0 ; j--) {
				if(j<=i) {
					System.err.print('*');
				}else {
					System.err.print(" ");
				}
			}
			System.err.println();
		}
	}

}
