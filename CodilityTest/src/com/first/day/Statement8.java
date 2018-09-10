package com.first.day;

public class Statement8 {

	public static void main(String args[]) {
		
		int[] A = { 2, -4, 6, -3, 9 };
		Statement8 Stm=new Statement8();
		System.out.println("output " +Stm.solution(A));

	}
	 public  int solution(int[] A) {
	      
		
	       int  minAbsSum=0;
	   
	      for(int i=0;i< A.length;i++)
	        {
	        	for(int j=i;j<A.length-1;j++)
	        	{
	        		 int sum=0;
	        		 
	        		for(int k=i;k<=j;k++)
	        		{
	        			sum =sum + A[k];
	        		
	        		}
	        		
	        		if(i==0)
	        		{
	        			minAbsSum=Math.abs(sum);
	        			
	        		}
				else
	        		{
	        			if(Math.abs(sum)<minAbsSum)
	        			{
	        				minAbsSum=Math.abs(sum);
	        			}
	        		}
	            
	        	}
	        }
	        return minAbsSum;
	    }
	
}
