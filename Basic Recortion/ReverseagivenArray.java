package com.jka.LearnBasicRecursion;

public class ReverseagivenArray {

	public static void main(String[] args) {
		int arr[] = {6, 5, 4, 3, 2, 1,  };
       
		for(int i=0;i<arr.length;i++) {
			System.err.print(arr[i]);
		}
		System.err.println();
		reverceArry(0, arr.length-1, arr);
		for(int i=0;i<arr.length;i++) {
			System.err.print(arr[i]);
		}
	}

	public static void reverceArry(int left, int right, int[] arr) {
		if (left > right)
			return;
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left += 1;
		right -= 1;
		reverceArry(left, right, arr);
	}
}
