//***********
// *********
//  *******
//   ***** 
//    ***    
//     *

package com.jka.pattern;

import java.util.Iterator;
import java.util.Scanner;

public class InvertedStarPyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	     System.err.println("Enter a number");
	     int target = scanner.nextInt();
	     int start = 1;
	     int end = target*2-1;
	     for(int i = 1; i <= target ; i++) {
	    	 for(int j=1; j<= target*2; j++) {
	    		 if(j>= start && j<=end) {
	    			 System.out.print('*');
	    		 }else {
	    			 System.out.print(' ');
	    		 }
	    	 }
	    	 System.out.println();
	    	 start++;
	    	 end--;
	     }
	}

}
