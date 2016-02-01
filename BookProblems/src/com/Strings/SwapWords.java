package com.Strings;

public class SwapWords {
	private static String s;
	private static char[] c;
	public static void main(String[] args) {
		
	s ="ram is costly";
	c=s.toCharArray();
	int i=0; int j=c.length-1;
	while (i<j) {
		swap(i, j);
		i++; j--;
	}
	System.out.println(c);
	}
	
	private static void swap(int i, int j) {
		char temp =c[i];
		c[i]=c[j];
		c[j]=temp;
		
	}
	
}
