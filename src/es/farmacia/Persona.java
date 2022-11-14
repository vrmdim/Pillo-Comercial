package es.farmacia;

public class Persona {
	
	private String nombre;
	private String NIF;
	
	
	public Persona() {
		
		
	}
	
	public Persona(String nombre) {
		

		this.nombre = nombre;
		
		
		
	}
	
	public Persona(String nombre, String NIF) {
		

		this.nombre = nombre;
		this.NIF = NIF;
		
		
		
	}



	public String getNombre() {
		return nombre;
	}

	public String getNIF() {
		return NIF;
	}



	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setNIF(String nIF) {
		NIF = nIF;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", NIF=" + NIF + "]";
	}
	
	
	
	
	
	
	
}
