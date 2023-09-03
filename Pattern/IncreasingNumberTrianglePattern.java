//1
//2  3
//4  5  6
//7  8  9  10
//11  12  13  14  15
//16  17  18  19  20  21

package com.jka.pattern;

import java.util.Scanner;

public class IncreasingNumberTrianglePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int target = scanner.nextInt();
      int value =1;
      for(int i = 1 ; i <= target ; i++) {
    	  for(int j=1; j<=i; j++) {
    		  System.err.print(" "+value++);
    	  }
    	  System.err.println();
      }
	}

}
