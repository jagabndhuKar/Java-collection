// *  
// ***
//***** 
//*****  
// ***
//  *   


package com.jka.pattern;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	     System.err.println("Enter a number");
	     int target = scanner.nextInt();
	     int bottomStart = 1;
	     int bottomEnd = target*2-1;
	     int topStart = target;
	     int topEnd = target;
	     for(int i = 1; i <= target-1 ; i++) {
	    	 for(int j=1; j<= target*2; j++) {
	    		 if(j>= topStart && j<=topEnd) {
	    			 System.out.print('*');
	    		 }else {
	    			 System.out.print(' ');
	    		 }
	    	 }
	    	 System.out.println();
	    	 topEnd++;
	    	 topStart--;
	     }
	     for(int i = 1; i <= target ; i++) {
	    	 for(int j=1; j<= target*2; j++) {
	    		 if(j>= bottomStart && j<=bottomEnd) {
	    			 System.out.print('*');
	    		 }else {
	    			 System.out.print(' ');
	    		 }
	    	 }
	    	 System.out.println();
	    	 bottomStart++;
	    	 bottomEnd--;
	     }
	}

}
