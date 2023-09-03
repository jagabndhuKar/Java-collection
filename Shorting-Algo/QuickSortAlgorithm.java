package com.jka.arry.shortingAlog;

public class QuickSortAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 1};
		quickShort(arr, 0, arr.length - 1);
		for (int num : arr) {
			System.out.print(num);
		}
	}

	public static void quickShort(int[] arr, int start, int end) {
		if (end-start <= 1)
			return;
		int left = start;
		int rigth = end;
		int pivort = arr[start];
		while (left <= rigth) {
			while (arr[left] < pivort)
				left++;
			while (arr[rigth] > pivort)
				rigth--;
			if (left <= rigth) {
				int temp = arr[left];
				arr[left] = arr[rigth];
				arr[rigth] = temp;
				left++;
				rigth--;
			}
		}
		quickShort(arr, start, left);
		quickShort(arr, left, end);
	}
}
