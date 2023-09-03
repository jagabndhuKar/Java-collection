package com.jka.arry.shortingAlog;

public class SelectionShort {

	public static void main(String[] args) {
       int[] arr1 = {2,1,6,5,4,3};
       selectionShort(arr1);
       for(int i : arr1) {
    	   System.out.print(i);
       }
       System.err.println();
       int[] arr2 = {3,1,5,2,4};
       selectionShort(arr2,0);
       for(int i : arr2) {
    	   System.err.print(i);
       }
	}
    public static void selectionShort(int[]arr) {
    	for(int i=0; i<arr.length ;i++) {
    		for(int j=i+1; j<arr.length ; j++) {
    			if(arr[i] > arr[j]) {
    				int temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    }
    public static void selectionShort(int[]arr, int counter) {
    	if(counter> arr.length-1) return;
		for(int j=counter+1; j<arr.length ; j++) {
			if(arr[counter] > arr[j]) {
				int temp = arr[counter];
				arr[counter] = arr[j];
				arr[j] = temp;
			}
		}
		selectionShort(arr, counter+1);
    }
}
