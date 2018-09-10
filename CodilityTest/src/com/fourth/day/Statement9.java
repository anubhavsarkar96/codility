package com.fourth.day;

import java.util.Scanner;

public class Statement9 {
	
	 public static void main(String[] args) {
		 int[][] A = {{0, 1, 9, 3}, {7, 5, 8, 3}, {9, 2, 9, 4},{4, 6, 5, 1}};
		 
		 Statement9 Smt1=new Statement9();
		System.out.println(Smt1.solution(A));
	}
	
	public int solution(int[][] A) {
	        
        for (int i = 0; i < A.length; i++)
        {
          
            int min_row = A[i][0], col= 0;
            
            for (int j = 1; j <  A.length; j++)
            {
                if (min_row > A[i][j])
                {
                    min_row = A[i][j];
                   col = j;
                }
            }
      
            for (int k = 0; k <  A.length; k++)
               {
                if (min_row < A[k][col])
                {
                      break;
                }
               
            if (k ==  A.length)
            {
               System.out.println("Value of Saddle Point " + min_row);
               return min_row;
            }
                   
               }
        }
      return 2;
    }
}