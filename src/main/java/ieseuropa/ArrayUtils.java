package main.java.ieseuropa;

import java.util.Arrays;

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
	public static int[] ordenarAsc(int[] array) {
		Arrays.sort(array);
		return array;
	}
	public static int mediana(int[] array) {
		array = ordenarAsc(array);
		int numeroCentral = array.length/2;
		if(array.length % 2 != 0) {
			return array[numeroCentral];
		}else {
			return (array[numeroCentral-1]+array[numeroCentral])/2;
		}
	}
	public static int minimo(int[] array){
		Arrays.sort(array);
		return array[0];
		
	}
	public static void main(String[] args) {
		System.out.println(mediaArray(new int[] { 3, 14, 32, 1}));
		System.out.println(mediaArray(new int[] {5 , 9 , 34 ,67}));
		
		int[] ordenar= new int[] { 5, 1, 4, 8, 2, 6, 3};
		for (int i : ordenarAsc(ordenar)) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n"+mediana(ordenar));
	}

}