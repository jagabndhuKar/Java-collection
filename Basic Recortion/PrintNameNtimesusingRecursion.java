package com.jka.LearnBasicRecursion;

public class PrintNameNtimesusingRecursion {

	public static void main(String[] args) {
      printNthTime(3);
	}
  static void printNthTime(int time) {
	  if(time==0)return;
	  System.out.println("its the nth timne"+time);
	  printNthTime(time-1);
  }
}
