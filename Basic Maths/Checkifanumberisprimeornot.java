package com.jka.math;

public class Checkifanumberisprimeornot {

	public static void main(String[] args) {
     System.out.println(isPrime(1)); 
	}
     
	public static boolean isPrime(int number) {
	  boolean isprime = true;
	  for(int i =2 ; i< Math.sqrt(number); i++) {
		  if(number%i==0) return false;
	  }
	  return isprime;
	}
}
