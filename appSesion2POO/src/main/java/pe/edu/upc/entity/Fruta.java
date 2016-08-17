package pe.edu.upc.entity;

public class Fruta {
	
	//Atributos de Instancia
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	//Atributos de Clase
	public static String LugarOrigen="UPC";
	
	//C
	public Fruta(){
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.puedoHacerJugo=false;		
	}

	public Fruta(String nombre, String color, String sabor) {
		super(); //Heredar constructor clase Padre
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo=false;		
	}

	
	//Metodos de Acceso de Datos (SET/GET)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}
	
	
	//Sobrescritura de metodos heredados
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
	
}
