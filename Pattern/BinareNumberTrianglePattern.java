//1
//01
//101

package com.jka.pattern;

import java.util.Scanner;

public class BinareNumberTrianglePattern {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.err.println("Eanter a number");
      int target = scanner.nextInt();
      for(int i =1 ; i <= target ; i++) {
    	  for(int j = 1 ; j <= i ; j++) {
    		  if((i+j)%2==0) {
    			  System.out.print(1);
    		  }else {
				System.out.print(0);
			}
    	  }
    	  System.out.println();
      }
	}

}
