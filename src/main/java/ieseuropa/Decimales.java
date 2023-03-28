package main.java.ieseuropa;

public class Decimales {


	
	
	public static float[] segundoGrado(float coeficienteA, float coeficienteB, float coeficienteC) {
	    float raiz = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
	    float x1 = (-coeficienteB + (float)Math.sqrt(raiz)) / (2 * coeficienteA);
	    float x2 = (-coeficienteB - (float)Math.sqrt(raiz)) / (2 * coeficienteA);
	    return new float[] { x1, x2 };
	}

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

		System.out.println("-----------------> ejecutar la ecuación de segundo grado ");
	  float ecuacionSegundoGrado[] =segundoGrado(1f, -10f, 25f);
	  System.out.println("Solucion positiva " + ecuacionSegundoGrado[0] + " Solucion negativa "+ ecuacionSegundoGrado[1]);
		

	}

}
