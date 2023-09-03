//A
//A B
//A B C
//A B C D
//A B C D E
//A B C D E F

package com.jka.pattern;

import java.util.Scanner;

public class IncreasingLetterTrianglePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		for(int i=1 ; i<=target ;i++) {
			char c = 'A';
			for(int j=1 ; j<=i ; j++) {
				System.err.print(c++);
			}
			System.err.println();
		}
	}

}
