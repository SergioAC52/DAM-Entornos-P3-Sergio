package main.java.ieseuropa;

public class Decimales {

	
	
	public static float[] segundoGrado(float coeficienteA, float coeficienteB, float coeficienteC) {
	    float raiz = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
	    float x1 = (-coeficienteB + (float)Math.sqrt(raiz)) / (2 * coeficienteA);
	    float x2 = (-coeficienteB - (float)Math.sqrt(raiz)) / (2 * coeficienteA);
	    return new float[] { x1, x2 };
	}
	
	
	public static void main(String[] args) {
		
	System.out.println("-----------------> ejecutar la ecuación de segundo grado ");
	float ecuacionSegundoGrado[] =segundoGrado(1f, -10f, 25f);
	System.out.println("Solucion positiva " + ecuacionSegundoGrado[0] + " Solucion negativa "+ ecuacionSegundoGrado[1]);
	
	
	
	}

}
