package es.farmacia;

public class Producto implements Nombrable{

	private String nombre;
	private int referencia;
	private double precio;
	private boolean activo;
	
	
	// CONSTRUCTOR (activamos producto en su creacion con los constructores por defecto)
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.activo = true;
		
	}
	
	public Producto(String nombre, int referencia, double precio) {
		
		this.nombre = nombre;
		this.referencia = referencia;
		this.precio = precio;
		this.activo = true;
		
		
	}
	
	
	
	public int getReferencia() {
		return referencia;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isActivo() {
		return activo;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}

	protected void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", referencia=" + referencia + ", precio=" + precio + ", activo=" + activo
				+ "]";
	}
	
	
	
	
	
	
}
