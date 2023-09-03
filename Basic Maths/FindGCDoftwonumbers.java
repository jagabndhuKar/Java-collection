package com.jka.math;

public class FindGCDoftwonumbers {
 public static void main(String[] args) {
//	System.out.println(findGCD(18,42));
	System.err.println(gcd(18,42));
	System.err.println(42%18);
}
 
 public static int findGCD(int first , int secound) {
	 int min = Math.min(first, secound);
	 int gcd = Integer.MIN_VALUE;
	 for(int i =1 ; i <= min ;i++) {
		 if(first%i==0 && secound%i==0 && (gcd<i)) {
				 gcd = i;
		 }
	 }
	 return gcd;
 }
 
 static int gcd(int a, int b) {
	    if (b == 0) {
	      return a;
	    }
	    return gcd(b, a % b);
	  }
}
