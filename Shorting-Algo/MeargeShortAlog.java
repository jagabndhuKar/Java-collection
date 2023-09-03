package com.jka.arry.shortingAlog;

public class MeargeShortAlog {

	public static void main(String[] args) {
      int[] arr= {1,4,3,2};
      mergeShort(arr);
      for(int m : arr) {
    	  System.out.print(m);
      }
	}
	public static void merge(int[]left,int[]right,int[]arr) {
		int leftIndex=0;
		int j =0;
		int mainArryIndex=0;
		while(leftIndex<left.length && j<right.length) {
			if(left[leftIndex]<right[j]) {
				arr[mainArryIndex++] = left[leftIndex++];
			}else {
				arr[mainArryIndex++] = right[j++];
			}
		}
		while(leftIndex<left.length) {
			arr[mainArryIndex++] = left[leftIndex++];
		}
		while (j<right.length) {
			arr[mainArryIndex++] = right[j++];
		}
	}
   public static void mergeShort(int[]arr) {
	   if(arr.length<=1)return;
	   int[] left = new int [arr.length/2];
	   int[] right = new int [arr.length-left.length];
	   int leftIndex =0;
	   int j =0;
	   for( ; leftIndex<left.length; leftIndex++) {
		   left[leftIndex] = arr[leftIndex];
	   }
	   
	   for( ; j<right.length; j++) {
		   right[j] = arr[leftIndex+j];
	   }
	   mergeShort(left);
	   mergeShort(right);
	   merge(left, right, arr);
   }
}
