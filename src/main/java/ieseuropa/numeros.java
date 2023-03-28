
package main.java.ieseuropa;

public class numeros {

	public static boolean Primo(int numero) {
	  
	    for (int i = 2; i <= Math.sqrt(numero); i++) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

