package es.farmacia;

public abstract class Persona implements Nombrable{
	
	
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


	@Override
	public String getNombre() {
		return this.nombre;
	}

	public String getNIF() {
		return this.NIF;
	}



	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setNIF(String NIF) {
		this.NIF = NIF;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", NIF=" + NIF + "]";
	}
	
	
	
	
	
	
	
}
