package es.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Persona{

	
	private Negocio negocio;
	private List<Pedido> pedidos;
	
	
	public Propietario(String nombre) {
		
		super(nombre);
		
	}
	
	public Propietario(String nombre, String NIF) {
		
		super(nombre, NIF);
		
	}
	
	
	public Propietario(String nombre, String NIF, Negocio negocio) {
		
		super(nombre, NIF);
		this.negocio = negocio;
		
	}

	
	
	
	
	public Negocio getNegocio() {
		return negocio;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	protected void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	
	protected void setPedidos(Pedido pedido) {
		
		if (this.pedidos == null) {
			
			this.pedidos = new ArrayList<Pedido>();
			
		}
		
		this.pedidos.add(pedido);
	}
	
	
	protected void setPedidos(List<Pedido> pedidos) {
		
		if (this.pedidos == null) {
			
			this.pedidos = new ArrayList<Pedido>();
			
		}
		
		this.pedidos.addAll(pedidos);
	}
	
	
	// Personalizamos el toString para Propietario
	@Override
	public String toString() {
		return "Propietario => Nombre: " + getNombre() + ", NIF: " + getNIF();
	}
	

	

}
