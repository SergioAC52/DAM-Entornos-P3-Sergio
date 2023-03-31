
package main.java.ieseuropa;

import java.util.ArrayList;

public class numeros {


	public static boolean Primo(int numero) {
	  
	    for (int i = 2; i <= Math.sqrt(numero); i++) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}


	private static int maximo(int[]numeros ) {
		
		int max=0;
		
		
		for(int i=0; i<numeros.length; i++) {
			
			if(numeros[i] > max) {
				
				max = numeros[i];
				
			}
			
			
		}
		
		
		return max;
		
		
	}
	
	private static String Pell() {

		String resultado = "";

		
		
		int numeroPrec = 2;

		int numeroAnte = 1;

		resultado = resultado + "0 1 2";
		
		for (int i = 1; i < 14; i++) {

			int aux = numeroAnte;

			numeroAnte = numeroPrec;

			numeroPrec = aux + (2 * (numeroPrec));

			resultado = resultado + " " + numeroPrec;


		}
		return resultado;
	}


	public static boolean suerte(int numero) {

		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= numero; i++) {
			numeros.add(i);
		}

		int contador = 1;
		while (contador < numeros.size()) {
			for (int j = contador; j < numeros.size(); j += contador) {
				numeros.remove(j);

			}
			contador++;
		}

		if (numeros.contains(numero)) {

			return true;

		}

		return false;

	}
	private static boolean esArmstrong(int num) {
		String numCadena = Integer.toString(num);
		int numDigitos = numCadena.length();
		double suma = 0;
		for (int i = 0; i < numDigitos; i++) {
			int cifra = Character.getNumericValue(numCadena.charAt(i));
			double potencia = Math.pow(cifra, numDigitos);
			suma += potencia;
		}
		if (suma == num) {
			return true;
		} else {
			return false;
		}
	}
	private static int calcularFactorial(int num) {
		if (num < 0) {
			num*=-1;
		}
		int factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}
	private static String calcularHora(int num) {
		int horas = num / 3600;
		int segundos = num % 3600;
		int minutos = segundos / 60;
		segundos = segundos % 60;
		String hora = String.valueOf(horas + "hs ").concat(String.valueOf(minutos + "mins "))
				.concat(segundos + "segs ");
		return hora;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[]numeros = {1,5,7,10,2,8};
		System.out.print(suerte(25));
		System.out.print(Pell());
		System.out.print(maximo(numeros));
		System.out.print(Primo(31));
		System.out.println(esArmstrong(153));
		System.out.println(calcularFactorial(16));
		System.out.println(calcularHora(3680));
	}



}
