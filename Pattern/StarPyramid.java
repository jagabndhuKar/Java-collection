//      *     
//     ***    
//    *****   
//   *******  
//  ********* 
// ***********

package com.jka.pattern;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	     System.err.println("Enter a number");
	     int target = scanner.nextInt();
	     for(int i=target ; i>0 ; i-- ) {
	    	 for(int j =1 ; j <= target ; j++ ) {
	    		 if(j<i) {
	    			 System.err.print(" ");
	    		 }else {
					System.err.print('*');
				}
	    	 }
	    	 for(int k =1 ; k <= target-i ; k++) {
	    		 System.err.print('*');
	    	 }
	    	 System.err.println();
	     }
	}

}
