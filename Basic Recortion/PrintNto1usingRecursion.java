package com.jka.LearnBasicRecursion;

public class PrintNto1usingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    printNToOne(5);
	}
  static void printNToOne(int n) {
	  if(n==0)return;
	  System.err.println(n);
	  n-=1;
	  printNToOne(n);
  }
}
