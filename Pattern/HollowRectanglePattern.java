//******
//*    *
//*    *
//*    *
//*    *
//******


package com.jka.pattern;

import java.util.Scanner;

public class HollowRectanglePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the target");
		int target = scanner.nextInt();
		for(int i = 1 ; i <= target ; i++) {
			for(int j=1 ; j <=target ; j++) {
				if(i == 1 || i == target || j == 1 || j==target) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
