//C
//B C
//A B C

package com.jka.pattern;

import java.util.Scanner;

public class AlphaTrianglePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		for(int i =target; i>=1 ; i--) {
			for(int j =target; j>=i;j--) {
				System.err.print((char)('A'+j));
			}
			System.err.println();
		}
	}

}
