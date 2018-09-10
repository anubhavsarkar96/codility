package com.third.day;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		int[] A={0, 3, 3, 7, 5, 3, 11, 1}; 
		
		Test1 S1=new Test1();
	System.out.println(S1.solution(A));

	}
	
	public  int solution(int[] A) {
		if (A.length==1){
		return -2;
		
		}
		Arrays.sort(A);
		
		long minimumdistance=Long.MAX_VALUE;
		
		 for (int i = 1; i < A.length; i++) {
			 long distance = (long) A[i]-A[i-1];
			 if(distance<minimumdistance){
				 minimumdistance=distance;
			 }
		 }
	return minimumdistance>100000000 ? -1: (int) minimumdistance ;
    }

}
