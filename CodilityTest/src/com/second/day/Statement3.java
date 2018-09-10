package com.second.day;

public class Statement3 {

	public static void main(String[] args) {
		
		double A[]={0,1,2,2,3,5};
		
		double B[]={500000,500000,0,0,0,20000};
		
		System.out.println("The multiplicative pairs of indices are:"+ solution(A, B));
	}
	
	
	public static int solution(double[] A, double[] B){
		int count=0;
		
		double C[]=new double[A.length];
		
		//Represent real number array
		
		for(int i=0;i<A.length;i++){	
			
			C[i]=A[i]+B[i]/1000000;
			//System.out.println(C[i]);
		}
		
		for(int i=0; i<C.length; i++){
			
			for(int j=i+1; j<C.length; j++){
				
				if(C[i]*C[j]>=C[i]+C[j])
					
					count=count+1;
				
					System.out.println("("+i+","+j+")");
			}
		}
				
		return count<1000000000 ? count:1000000000;
	}
	
	

}
