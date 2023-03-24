
package main.java.ieseuropa;

import java.util.ArrayList;

public class numeros {
	
	private static int maximo(int[]numeros ) {
		
		int max=0;
		
		for(int i=0; i<numeros.length; i++) {
			
			if(numeros[i] > max) {
				
				max = numeros[i];
				
			}
			
			
		}
		
		
		return max;
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums = {2,6,1,6,10};
		
		System.out.print(maximo(nums));
	}

}
