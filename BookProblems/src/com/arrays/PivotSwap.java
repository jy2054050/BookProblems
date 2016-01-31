package com.arrays;

import java.util.Arrays;

/**
 * @author jitu
 *
 */
public class PivotSwap {

	private static int[] A;
	private static int size;
	private static int pivot;
	
	
	PivotSwap(int arraySize, int[] array,int pivotIndex){
		size = arraySize;
		A= array;
		pivot= pivotIndex;
		
	}
	public static void main(String[] args) {
		int [] array = new int []{1,9,76,34,2,5,77,8,54,5,65,76,87,3,5,6,89};
		PivotSwap pivotSwap =new PivotSwap(17, array,array[3]);
		//System.out.println(array.length);
//		System.out.println(array[pivot]);
		
		pivotSwap.pivotSwapFunction();
		System.out.println(Arrays.toString(A));
		
	}

	private void pivotSwapFunction() {
		int smallPointer =0;
		int bigPointer=size-1;
		int equalPointer=size-1;
		//{1,9,76,34,2,5,77,8,54,5,65,76,87,3,5,6,89};
		 //System.out.println(Arrays.toString(A) +" : "+A[equalPointer] +" : "+A[bigPointer]);
		while (equalPointer>smallPointer){
			 if (A[equalPointer]==pivot){
				equalPointer--;
			}else if(A[equalPointer]> pivot){
				swap(equalPointer,bigPointer);
				bigPointer--;equalPointer--;
			}else{
				//{1,9,76,34,2,5,77,8,54,5,65,76,87,3,5,6,89};
				while(smallPointer<equalPointer){
					if(A[smallPointer]>=pivot){
						break;
					}else if(A[smallPointer]<pivot){
						smallPointer++;
					}
				}
				swap(smallPointer,equalPointer);
			}
			//System.out.println(Arrays.toString(A) +" : "+A[equalPointer] +" : "+A[bigPointer]);
			
		}	
		//System.out.println(Arrays.toString(A));
				
	}
	
private static void swap( int i, int j) {
	if(i!=j){
		int temp = A[i];
		A[i]=A[j];
		A[j]=temp;
	}else ;
	}
}