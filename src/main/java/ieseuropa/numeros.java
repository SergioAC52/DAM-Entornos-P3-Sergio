
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



}
