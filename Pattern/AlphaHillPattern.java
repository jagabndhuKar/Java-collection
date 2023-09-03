//     A     
//    ABA    
//   ABCBA   
//  ABCDCBA  
// ABCDEDCBA 
//ABCDEFEDCBA

package com.jka.pattern;

import java.util.Scanner;

public class AlphaHillPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		for(int i=1 ; i<=target ;i++) {
			char c = 'A';
			for(int j=target ; j>0 ; j--) {
				if(j<=i)System.err.print(c++);
				else System.err.print(" ");
			}
			for(int j=2 ; j<=i ; j++) {
			System.err.print((char)(--c-1));
			}
			System.err.println();
		}
	}

}
