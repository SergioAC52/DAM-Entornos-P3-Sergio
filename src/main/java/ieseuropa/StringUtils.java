package main.java.ieseuropa;

public class StringUtils {
	
	private static String repetirTodo(String palabra) {
		
		String resultado = "";
		
		for (int i = 0; i < palabra.length(); i++) {

			for(int j=0; j<2 ; j++) {
				 
				
				resultado = resultado + palabra.charAt(i);
				
			}
			

			}

		

		return resultado;
	}


	public static void main(String[] args) {
	
	System.out.print(repetirTodo("hola"));	
		
	}

}