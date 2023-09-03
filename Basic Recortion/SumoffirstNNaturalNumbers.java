package com.jka.LearnBasicRecursion;

public class SumoffirstNNaturalNumbers {

	public static void main(String[] args) {
		System.err.println(sum(5,0));
	}
  static int sum(int n , int sum) {
	  if(n==0)return sum;
	  sum = sum+n;
	  n-=1;
	  return sum(n, sum);
  }
}
