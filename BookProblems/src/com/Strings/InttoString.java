package com.Strings;

public class InttoString {
	public static void main(String[] args) {
			int a=-123;
			String s= "-123";
			System.out.println(intToString(a));
			System.out.println(StringToInt(s));
	}

	private static int StringToInt(String s) {
		boolean isNeg=false;
		if (s.charAt(0)=='-'){ 
			s=s.substring(1);
			isNeg = true;
		}
		int length= s.length()-1;
		//System.out.println(s);
		int newX=0;
		char[] c = s.toCharArray();
		int i= length;
		int j=0;
		while (i>=0){
			newX= newX+ (int)((c[i]-'0')* Math.pow(10, j));
			i--;j++;
		}
		if (isNeg) return  -newX; 
		else return newX;
	}
	
	

	private static String intToString(int x) {
		boolean isNeg=false;
		String result="";
		if(x==0) return "0";
		if (x < 0) {
			isNeg=true;
			x= (-x);
		}
		int i=0;
		StringBuilder sb = new StringBuilder();
		sb.append("");
		while(x>0){
			sb.append(x%10);
			x=x/10;
			
		}
		if(isNeg) sb.append("-");
		sb.reverse();
		return sb.toString();
	}
}