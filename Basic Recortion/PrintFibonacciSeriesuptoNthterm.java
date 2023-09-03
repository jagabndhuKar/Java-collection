package com.jka.LearnBasicRecursion;

public class PrintFibonacciSeriesuptoNthterm {

	public static void main(String[] args) {
      fibo(5, 0, 1);
      System.err.println();
      System.err.println(fibonacci(3));
      System.err.println(fibo2(3, 1, 1, 0)+" is febo2");
	}
 static void fibo(int n,int a, int b) {
	 if(a>n)return;
	 int c =a+b;
	 System.err.print(a);
	 a=b;
	  b=c;
	 fibo(n, a, b);
 }
 
 static int fibonacci(int N){
     
         // Base Condition.
         if(N <= 1){
             
             return N;
         }
         
         return (fibonacci(N-1) + fibonacci(N-2));
         
 } 
 static int fibo2(int n,int a, int b,int c) {
	 if(n==1)return a;
	  c =a+b;
	 a=b;
	  b=c;
	  n=n-1;
	return fibo2(n, a, b,c);
 }
}
