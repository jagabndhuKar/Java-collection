package com.jka.LearnBasicRecursion;

public class FactorialofaNumber {

	public static void main(String[] args) {
     System.err.println(factor(3, 1));
	}
static int factor(int number, int fac) {
	if(number == 0) return fac;
	fac*=number;
	number-=1;
	return factor(number, fac);
}
}
