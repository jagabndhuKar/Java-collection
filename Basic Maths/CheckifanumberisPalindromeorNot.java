package com.jka.math;

public class CheckifanumberisPalindromeorNot {
	public static void main(String[] args) {
             System.err.println(isPalindrom(10));
	}
	
	public static boolean isPalindrom(int num) {
		String number = num+"";
		int left=0;
		int right = number.length()-1;
		while(left<right) {
			if(number.charAt(left)!= number.charAt(right)) return false;
			left++; right--;
		}
		 return true;
	}
}
