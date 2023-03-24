package main.java.ieseuropa;

public class numeros {

	private static String Pell() {

		String resultado = "";

		int numeroPrec = 2;

		int numeroAnte = 1;

		for (int i = 1; i < 16; i++) {

			int aux = numeroAnte;

			numeroAnte = numeroPrec;

			numeroPrec = aux + (2 * (numeroPrec));

			resultado = resultado + " " + numeroPrec;

		}
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pell());
		
	}

}
