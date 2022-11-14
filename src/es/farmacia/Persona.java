package es.farmacia;

public class Persona {
	
	private String nombre;
	private String NIF;
	private String telf;
	
	
	public Persona() {
		
		
	}
	
	public Persona(String telf) {
			
			this.telf = telf;
			
			
			
	}

	
	public Persona(String nombre, String telf) {
		

		this.nombre = nombre;
		this.telf = telf;
		
		
		
	}

	public Persona(String nombre, String NIF, String telf) {
		
		
		this.NIF = NIF;
		this.nombre = nombre;
		this.telf = telf;
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getNIF() {
		return NIF;
	}

	public String getTelf() {
		return telf;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setNIF(String nIF) {
		NIF = nIF;
	}

	protected void setTelf(String telf) {
		this.telf = telf;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", NIF=" + NIF + ", telf=" + telf + "]";
	}
	
	
	
	
	
	
	
}
