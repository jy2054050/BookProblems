package com.arrays;

public class MissingPositiveNum {

	public static void main(String[] args) {
			
		int [] array = new int []{1,9,2,5,3,4,6,7};
		boolean [] temp_array = new boolean[100000];
		for (int i = 0; i < array.length; i++) {
			temp_array[array[i]]=true;
		}
		for (int j = 1; j < temp_array.length; j++) {
			if(temp_array[j] != true){
				System.out.println(j);
				return;
			}
		}
		
	}
	
	
}
