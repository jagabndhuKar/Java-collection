package com.jka.LearnBasicRecursion;

public class CheckifthegivenStringisPalindromeornot {

	public static void main(String[] args) {
		String str = "aaab c";
		System.err.println(str.replaceAll(" ", ""));
    System.err.println(isPalindrom(0,str.length()-1 , str));
	}
   public static boolean isPalindrom(int start, int end, String str) {
	   if(start>end)return true;
	   if(str.charAt(start)!=str.charAt(end)) return false;
	   start+=1;
	   end-=1;
	   return isPalindrom(start, end, str);
   }
}
