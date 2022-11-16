package es.farmacia;

public class Negocio implements Nombrable{

	private String nombre;
	private String direccion;
	private PoC poc;
	private Cooperativa cooperativa;
	
	
	// CONSTRUCTORES
	public Negocio(String nombre, PoC poc, Cooperativa cooperativa) {
		
		this.nombre = nombre;
		this.poc = poc;
		this.cooperativa = cooperativa;
		
	}
	
	
	public Negocio(String nombre, String direccion, PoC poc, Cooperativa cooperativa) {
		
		this.nombre = nombre;
		this.poc = poc;
		this.cooperativa = cooperativa;
		this.direccion = direccion;
		
	}
	
	
	
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	protected void setPoc(PoC poc) {
		this.poc = poc;
	}


	protected void setCooperativa(Cooperativa cooperativa) {
		this.cooperativa = cooperativa;
	}


	public String getDireccion() {
		return direccion;
	}


	public PoC getPoc() {
		return poc;
	}


	public Cooperativa getCooperativa() {
		return cooperativa;
	}


	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "Negocio [nombre=" + nombre + ", direccion=" + direccion + ", poc=" + poc + ", cooperativa="
				+ cooperativa + "]";
	}
	
	
	
	

}
