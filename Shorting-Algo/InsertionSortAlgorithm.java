package com.jka.arry.shortingAlog;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
 
		 int[] arr1 = {2,1,6,5,4,3};
		 insertionSort(arr1);
	       for(int i : arr1) {
	    	   System.out.print(i);
	       }
	       
	       System.out.println();
	       int[] arr2 = {3,1,5,2,4};
	       insertionSort(arr2,0);
	       for(int i : arr2) {
	    	   System.err.print(i);
	       }
	}

	public static void insertionSort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j>=1;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	public static void insertionSort(int[]arr,int counter) {
		if(counter>arr.length-1) { return;}
			for(int j=counter; j>=1;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			insertionSort(arr, counter+1);
	}
}
