package com.arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	private static int[] A;
	private static int size;
	private static int num;
	private static int index=0;

	
	
	RemoveDuplicate(int arraySize, int[] array,int n){
		size = arraySize;
		A= array;
		num=n;
	}
	
	public static void main(String[] args) {
		int [] array = new int []{1,9,5,5,5,54,5,65,76,87,3,5,6,89};
		int num=5;
	//	System.out.println(array.length);
		RemoveDuplicate rm =new RemoveDuplicate(14, array,num);
		//System.out.println(array.length);
//		System.out.println(array[pivot]);
		
		rm.removeFunction();
		System.out.println(index+1);
	}

	private void removeFunction() {
			
		for (int i = 0; i < A.length; i++) {
			
			if(A[i]!=num){
				A[index++]=A[i];
			}
		}
		
	}
}
