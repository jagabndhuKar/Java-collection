package com.jka.math;

public class Countdigitsinanumber {

	public static void main(String[] args) {
      System.err.println(countNumber(123456));
	}
       public static int countNumber(int n) {
    	   String numberString = n+"";
    	   return numberString.length();
       }
}
