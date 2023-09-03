package com.jka.math;

public class CheckifanumberisArmstrongNumberornot {

	public static void main(String[] args) {
      System.out.println(isAmstrong(153));
	}
public static boolean isAmstrong(int number) {
	int length = (number+"").length();
	int temp = number;
	int sum =0;
	while(temp!=0) {
		int b = temp%10;
		sum+=Math.pow(b, length);
		temp/=10;
	}
	return sum==number;
}
}
