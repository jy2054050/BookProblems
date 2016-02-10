package com.InterviewF;

import java.util.Arrays;

public class PairSumK {
	
	public static void main(String[] args) {
	 int [] arr = new int[] {1, 4, 45, 6, 10, -8};
	 int k =16;
	 findSumPair(arr,k);
	}
	private static void findSumPair(int[] arr, int k){
		Arrays.sort(arr);
		int s = 0;
		int e = arr.length-1;
		while(s<e) {
			if (arr[s]+arr[e]==k) {
				System.out.println("Found: "+ arr[s]+" "+arr[e]);
				return;
			}
			else if (arr[s]+arr[e] >k) e--;
			else if (arr[s]+arr[e] <k) s++;
				
		}
		
	}
	
}
