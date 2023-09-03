//A 
//B B
//C C C
//D D D D
//E E E E E
//F F F F F F

package com.jka.pattern;

import java.util.Scanner;

public class AlphaRampPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		char c = 'A';
		for(int i=1 ; i<=target ;i++) {
			for(int j=1 ; j<=i ; j++) {
				System.err.print(c);
			}
			c++;
			System.err.println();
		}
	}

}
