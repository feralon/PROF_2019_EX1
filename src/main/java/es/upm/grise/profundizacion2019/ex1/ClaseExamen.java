package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		
		float result = 0;
		
		// nodo 1
		while( a > b) {
			a--;
		}
		
		// nodo 2
		if (a <= b) {
			// nodo 3
			result = 0;
		}
		
		else {
			// nodo 4
			result = b;
		}
		
		return result;
	}

}
