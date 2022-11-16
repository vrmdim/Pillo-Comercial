package es.farmacia;

public class Cooperativa implements Nombrable{

	private String nombre;
	
	public Cooperativa(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}



	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Cooperativa [nombre=" + nombre + "]";
	}

	
	
	
}
