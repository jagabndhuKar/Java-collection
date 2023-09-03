//1    1
//12  21
//123321

package com.jka.pattern;

import java.util.Scanner;

public class NumberCrownPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	      System.err.println("Eanter a number");
	      int target = scanner.nextInt();
	      for(int i =1; i <= target ; i ++) {
	    	  int right=i;
	    	  
	    	  for(int j = 1 ; j <= target ; j++) {
	    		  if(j<=i) {
	    			  System.out.print(j);
	    		  }
	    		  else {
					System.out.print(" ");
				}
	    	  }
	    	  
	    		  for(int k =target ; k>0 ; k--) {
	    			  if(k<=i) {
	    				  System.out.print(k);
	    			  }else {
	    				  System.out.print(" ");
	    			  }
	    		  }
	    		  System.out.println();
	    	  }
	      }
	}


