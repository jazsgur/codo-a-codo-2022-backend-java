package ejercicios;

public class Persona {
	
	// Atributos <modificador de acceso (PPP)> <Tipo/Clase> <nombre del atributo>
	public Gato mascota;
	
	// Constructor (el formato se ve parecido que un metodo pero el nombre es igual al de la clase)
	public Persona(Gato unGato) {
		mascota = unGato;
	}
	
	// Metodos/Mensaje <PPP> <Tipo/Clase de retorno> <nombre del metodo> <parametros entre parentesis> <el codigo que ejecuta entre llaves>
	public Boolean sosAdulto() {
		return true;
	}
}
