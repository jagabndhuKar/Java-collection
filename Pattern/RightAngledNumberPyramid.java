package com.jka.pattern;

import java.util.Scanner;

public class RightAngledNumberPyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int target = scanner.nextInt();
		for (int i = 1; i <= target; i++) {
			for (int j = 1; j <= i; j++) {
				System.err.print(j);
			}
			System.err.println();
		}
	}

}
