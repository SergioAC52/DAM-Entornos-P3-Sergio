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
	public static void main(String[] args) {
		System.out.println(mediaArray(new int[] { 3, 14, 32, 1}));
		System.out.println(mediaArray(new int[] {5 , 9 , 34 ,67}));
		
		int[] ordenar= new int[] { 5, 1, 4, 8, 2, 6};
		ordenar = ordenarAsc(ordenar);
		for (int i : ordenar) {
			System.out.print(i+" ");
		}
	}

}