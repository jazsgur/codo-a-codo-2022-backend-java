package ejercicios;

public class Ejercicio2Prueba {

	public static void main(String[] args) {
		Gato mishi = new Gato("Gricel", 3, 80);
		Persona jorge = new Persona(mishi);
		
		System.out.println(jorge.sosAdulto());
	}

}
