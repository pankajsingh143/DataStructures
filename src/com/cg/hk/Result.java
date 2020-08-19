package com.cg.hk;

public class Result {
	public static void main(String args[]) {
		Result.ways(4, 2);
	}
	public static int ways(int total, int k) {
		int totalNoWays = 0;
		int sum = 0;
		int i = 1;
		int count = 0;
		while (sum != total && i <= k) {
			sum = sum + i;
			count++;

		}
		totalNoWays++;
		for (int j = 1; j < count && sum != total; j++) {
			sum = sum + j + 1;
		}
		System.out.println(count);
		return totalNoWays;
	}

}
