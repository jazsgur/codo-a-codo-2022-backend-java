/**
 * 
 */
package ejercicios;

public class Ejercicio4Prueba {

	public static void main(String[] args) {
		/* Crear plantas: todas tienen una especie (string), altura (float), y tienen vida o no. 
		 Lo que se puede hacer es: regarla o preguntarle si está viva. Si la regás crece un centimetro, 
		 pero si la planta es un pino se muere si la regás.
		 Aparte: las plantas tienen una maceta y la maceta tiene un color (string)
		 En este archivo creo algunos objeto planta y los pruebo
		 ATENTI float siempre poner "f" al final y long la "l"*/ 
		
		Maceta maceta = new Maceta("roja");
		Plantas potus = new Plantas ("Potus", 1.5f, true);
		potus.setMaceta(maceta);
		Plantas pino = new Plantas ("Pino", 2f, true);
		pino.setMaceta(null);
		
		pino.regar();
		 
		var a=2;
	}

}
