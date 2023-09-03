package com.jka.pattern;

import java.util.Scanner;

public class InvertedRightPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int target = scanner.nextInt();
		for (int i = target; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.err.print('*');
			}
			System.err.println();
		}
	}
}
