package ejercicios;

public class Gato {

	public String nombre;
	public int edad;
	public float hambruna;
	
	public Gato(String nombre, int edad, float hambruna) {
		this.nombre = nombre;
		this.edad = edad;
		this.hambruna = hambruna;
	}
	
	public void comer() {
		hambruna = (hambruna-10);
	}
	public void jugar() {
		hambruna = (hambruna+30);
	
	}
	
}
