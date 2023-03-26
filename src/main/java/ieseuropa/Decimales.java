package main.java.ieseuropa;

public class Decimales {

	public static float eliminarDecimales(float dato) {
		return (int) dato;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------> Eliminar decimales numero");
		System.out.println(eliminarDecimales(8.5465f));
		System.out.println(eliminarDecimales(23.4592f));
		
		
		
		
	}

}
