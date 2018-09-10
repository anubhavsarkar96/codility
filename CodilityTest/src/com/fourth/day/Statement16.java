package com.fourth.day;

public class Statement16 {

	public static void main(String[] args) 
	{
		System.out.println(solution(102));
	}
		
		public static int solution(int N) 
		{
			if(N>0 && N<=1000000000){
	            return -1;
	            }

			 int[] B = new int[100001];
				        
				  int count = 0;
				 //int l=0;
				  
				  while (N > 0) 
				  {
					  
				   B[count] = N % 2;
				   N = N/2;
				       count++;   
				  }
				  
				  for (int i= 1; i < count; i++) 
				  {
				  if (i <= count / 2)
				  {
				   boolean flag = true;
				   
				  for (int j = 0; j < count - i; j++) 
				  {
				    if (B[j] != B[j + i]) 
				    {
				        flag = false;
				          break;
				     }
				       }
				   if (flag) {
				       return i;
				       }
				       }
				       }

				        return -1;
		}
	}
		

