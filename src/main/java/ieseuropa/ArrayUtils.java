package main.java.ieseuropa;

public class ArrayUtils {

	
	public static int mediaArray(int[] datos) {
		int cantDatos = 0;
		int acumulador = 0;
		for(int i = 0; i < datos.length; i++) {
			acumulador = acumulador + datos[i];
			cantDatos++;
		}
		return acumulador/cantDatos;
	}
	
	public static void main(String[] args) {
		System.out.println(mediaArray(new int[] { 3, 14, 32, 1}));
		System.out.println(mediaArray(new int[] {5 , 9 , 34 ,67}));
	}

}