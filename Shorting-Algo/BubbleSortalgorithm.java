package com.jka.arry.shortingAlog;

public class BubbleSortalgorithm {

	public static void main(String[] args) {
	       int arr[] = {2,1,6,5,4,3};
	       bubbleShort(arr);
	       for(int i : arr) {
	    	   System.out.println(i);
	       }
	}
   public static void bubbleShort(int[]arr) {
	   for(int i=0; i<arr.length; i++) {
		   for(int j=0; j<arr.length-1;j++) {
			   if(arr[j] > arr[j+1]) {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1]=temp;
			   }
		   }
	   }
   }
   
   public static void bubbleShort(int[]arr, int counter) {
	      if(counter>arr.length-1) return;
		   for(int j=0; j<arr.length-1;j++) {
			   if(arr[j] > arr[j+1]) {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1]=temp;
			   }
		   }
   }
}
