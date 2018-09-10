package com.second.day;

import java.util.Arrays;

public class Statement17 {
	
	public static void main(String args[]){
		
		int A[]={3, 5, 6, 3, 3, 5};
		
		//Arrays.sort(A);
		
		System.out.println("The number of identical pair are "+solution(A));
		
	}
	
	public static int solution(int A[]){
		
		int count=0;
		for(int i=0;i<A.length;i++){
			
			for(int j=i+1; j<A.length; j++){
				
				if(A[i]==A[j]){
					
					count=count+1;
					
					System.out.println("("+i+","+j+")");
				}			
			}
		}	
		
		return count<1000000000 ? count:1000000000;
	}

}
