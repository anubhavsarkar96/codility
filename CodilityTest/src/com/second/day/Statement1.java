package com.second.day;

public class Statement1 {


	public static void main(String[] args) {
		
        int[] A = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };
       
        Statement1 S1=new Statement1();
     System.out.println(S1.solution(A));
    }

   public int solution(int[] A) {
    	
        int firstIndex = 0;
        
        int deepest = -1;
        
        int depth = 0;
        
        boolean climbingUp = false;
        
        for (int i = 0; i < A.length - 1; i++) {
        	
            int currentHeight = A[i];
            int nextHeight = A[i + 1];
            
            if (!climbingUp) { 
            	
                if (currentHeight < nextHeight) {
                   climbingUp = true;
                    deepest = i;
                }
            } 
            else
            { 
                if (currentHeight > nextHeight) {
                    
                    int lastIndex = i;
                    
                    int depthA = A[firstIndex] - A[deepest];
                    
                    int depthB = A[lastIndex] - A[deepest];
                    
                    int currDepth = Math.min(depthA, depthB);
                    depth = Math.max(depth, currDepth);
                
                    firstIndex = i;
                   climbingUp = false;
                }
            }
        }

        int depthA = A[firstIndex] - A[deepest];
        int depthB = A[A.length - 1] - A[deepest];
        int currDepth = Math.min(depthA, depthB);
      
        depth = Math.max(depth, currDepth);
       
        return depth;
    }
}
