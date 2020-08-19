
package com.cg.algo;

import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.keySet();
		int[] ar = {2, 7, 9, 12};
		int n = 12;
		int in = binarySearch(n, ar);

		if (in == -1)
			System.out.println("Not found");
		else
			System.out.println("Fount at index " + in);

	}
	public static int binarySearch(int n, int[] ns) {
		int index = -1;;
		int low = 0;
		int high = ns.length - 1;
		System.out.println("high = " + high);
		int mid = 0;
		// System.out.printf("index : %d mid: %d high: %d ", index, mid, high);

		while (low <= high) {
			mid = low + ((high - low) / 2);
			System.out.println("mid  = " + mid);
			if (n == ns[mid]) {
				index = mid;
				break;
			}
			System.out.printf("index : %d mid: %d high: %d low: %d %n", index,
					mid, high, low);
			if (n < ns[mid]) {
				System.out.printf("n is less then mid = %d high = %d ", mid,
						high);
				high = mid - 1;
			} else if (n > ns[mid]) {
				low = mid + 1;
				System.out.printf("n is greater then mid , low = %d mid = %d ",
						low, mid);

			} else {

				System.out.printf("index : %d mid: %d high: %d ", index, mid,
						high);
			}

		}
		return index;

	}
}
