package com.jka.math;

public class Reverseanumber {

	public static void main(String[] args) {
     System.err.println(reverseNumber(15342364));
	}
    public static int reverseNumber(int number) {
    	int reversedNumber=0;
    	while(number!=0) {
     		int remander = number%10;
    		int tempReversedNumber = reversedNumber*10+remander;
    		if((tempReversedNumber-remander)/10 != reversedNumber) return 0;
    		number=number/10;
    		reversedNumber = tempReversedNumber;
    	}
    	return reversedNumber;
    }
}
