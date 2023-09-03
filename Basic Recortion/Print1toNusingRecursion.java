package com.jka.LearnBasicRecursion;

public class Print1toNusingRecursion {

	public static void main(String[] args) {
     printTopN(5, 1);
	}
  static void printTopN(int n , int i) {
	  if(i>n) return;
	  System.err.println(i);
	  i+=1;
	  printTopN(n, i);
  }
}
