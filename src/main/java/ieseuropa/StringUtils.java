package main.java.ieseuropa;

public class StringUtils {
	private static String mayus(String palabra) {

		return palabra.toUpperCase();

	}

	private static String minus(String palabra) {

		return palabra.toLowerCase();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mayus("hola"));
		System.out.println(minus("HOLA"));
	}



}
