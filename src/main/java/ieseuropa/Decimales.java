package main.java.ieseuropa;

public class Decimales {


	public static float eliminarDecimales(float dato) {
		return (int) dato;
  }
	public static float redondearAlza(float dato) {
		return (int)Math.ceil(dato);

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------> Eliminar decimales numero");
		System.out.println(eliminarDecimales(8.5465f));
		System.out.println(eliminarDecimales(23.4592f));

		System.out.println("-----------------> Decimales Redondear el número al alza");
		System.out.println(redondearAlza(37.23f));
		System.out.println(redondearAlza(23.67f));

		
		
		
	}

}
