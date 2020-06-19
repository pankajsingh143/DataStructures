package com.cg;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {8, 4, 9, 7};
		bubblesort(ar);

	}
	public static void bubblesort(int[] a) {
		int temp = 0;
		int count = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[i] >= a[j]) {
					// swap
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
