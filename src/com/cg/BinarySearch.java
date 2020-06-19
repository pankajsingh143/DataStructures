
package com.cg;
public class BinarySearch {

	public static void main(String[] args) {
		int[] ar = {2, 7, 9, 12};
		int n = 8;
		int in = binarySearch(n, ar);

		if (in == -1)
			System.out.println("Not found");
		else
			System.out.println("Fount at index " + in);

	}
	public static int binarySearch(int n, int[] ns) {
		int index = 0;
		int low = 0;
		int high = ns.length - 1;
		int mid = ns.length / 2;
		// System.out.printf("index : %d mid: %d high: %d ", index, mid, high);
		if (n == ns[mid]) {
			index = mid;
		}
		if (n < ns[mid]) {
			high = mid;
		} else {
			low = mid + 1;
		}
		for (int i = low; i < high; i++) {
			if (n == ns[i])
				index = i;
			else
				index = -1;
		}
		return index;
	}
}
