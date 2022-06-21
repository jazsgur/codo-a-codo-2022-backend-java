package ejercicios;

public class Plantas {
	
	public String especie;
	public float altura;
	public boolean vida;
	public Maceta contenedor;
	
	public Plantas (String especie, float altura, boolean vida) {
		this.especie = especie;
		this.altura = altura;
		this.vida = vida;
	}
	
	public void setMaceta(Maceta unaMaceta) {
		contenedor = unaMaceta;
	}
	
	public void regar () {
		if (especie=="Pino") { 
			vida = false;
		}
		else {
			altura = altura+1;
		}
		
	}
	public boolean getVida () {
		return this.vida;
	}
	
	
}
	
