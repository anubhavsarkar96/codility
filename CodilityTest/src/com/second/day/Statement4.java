package com.second.day;

import java.util.Arrays;

public class Statement4 {
	
	public static void main(String args[]){
		int A[]={2,2,2,2,2,3,4,4,4,6};
		
		Arrays.sort(A);
		
		System.out.println("The leader of arrays is "+solution(A));
	}
	
	public static int solution(int A[]){
		
		int count=1;
		
		int oc=A.length/2;
		
		for(int i=0; i<A.length; i++){
			
			for(int j=i+1; j<A.length-1; j++)
				{
					if(A[i]==A[j])
					{
						 count=count+1;
					}	
				}
					if(count>oc)
					{
					  return A[i];
							
					}	
			 break;
			}
		
		return -1;		
		
	}

}
