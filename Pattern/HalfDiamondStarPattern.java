// *  
//  **
//  ***  
//  **
//  *  

package com.jka.pattern;

import java.util.Scanner;

public class HalfDiamondStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	     System.err.println("Enter a number");
	     int target = scanner.nextInt();
     for(int i =1 ; i <= target ; i++) {
    	 for(int j =1 ; j <= target ; j++) {
    		 if(j<=i) {
    			 System.out.print('*');
    		 }
    	 }
    	 System.out.println();
     }
     
     for(int i =1 ; i <= target-1 ; i++) {
    	 for(int j =1 ; j <= target-1 ; j++) {
    		 if(i<=j) {
    			 System.out.print('*');
    		 }
    	 }
    	 System.out.println();
     }
	}

}
