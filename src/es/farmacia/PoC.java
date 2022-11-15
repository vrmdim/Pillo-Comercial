package es.farmacia;

public class PoC extends Persona implements Llamable{

	
	private String telf;
	
	public PoC(String telf) {
		
		this.telf = telf;
		
	}
	
	public PoC(String nombre, String telf) {
		
		super(nombre);
		this.telf = telf;
		
	}
	
	
	public PoC(String nombre, String NIF, String telf) {
		
		super(nombre, NIF);
		this.telf = telf;
		
	}

	

	protected void setTelf(String telf) {
		this.telf = telf;
	}
	
	
	
	@Override
	public String getTelf() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "PoC [telf=" + telf + ", nombre=" + getNombre() + ", NIF=" + getNIF() + "]";
	}


	
	
	
	
	
}
