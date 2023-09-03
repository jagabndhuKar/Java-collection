package com.jka.math;

public class PrintallDivisorsofagivenNumber {
public static void main(String[] args) {
	divisors(36);
}

public static void divisors(int number) {
	for(int i =1 ; i<= Math.sqrt(number); i++) {
		if(number%i==0) {
			System.out.print(i+" ");
			if(number/i!=i) {
				System.out.print((number/i)+" ");
			}
		}
	}
}
}
