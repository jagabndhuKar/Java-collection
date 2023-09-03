package com.jka.pattern;

import java.lang.annotation.Target;
import java.util.Scanner;

public class InvertedNumberedRightPyramid {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.err.println("Enter a number");
     int target = scanner.nextInt();
     for(int i = target ; i >5  ; i--) {
    	 for(int  j= 1 ; j<= i ; j++) {
    		 System.err.print(j);
    	 }
    	 System.err.println();
     }
	}

}
