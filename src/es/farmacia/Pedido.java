package es.farmacia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pedido implements Datable{

	
	
	private LocalDate fPedido;
	private double precioPedido;
	// IVA
	private double IVA = 10;
	private int numLineas;
	private List<LineaPedido> lineasPedido;
	private Propietario propietario;
	
	
	// CONSTRUCTORES
	public Pedido(List<LineaPedido> lineasPedido, Propietario propietario) {
		
		this.lineasPedido = lineasPedido;
		this.propietario = propietario;
		
		// FECHA ACTUAL
		this.fPedido = LocalDate.now();
		
		//ACTUALIZAMOS NUMERO LINEAS PEDIDO
		setNumLineas();
		
		// ACTUALIZAMOS PRECIO TOTAL DEL PEDIDO
		
		
	}

	public void imprimirPedido() {
		
		System.out.println("RESUMEN DEL PEDIDO");
		System.out.println("------------------");
		System.out.println();
		System.out.println("> Fecha Pedido: " + getfPedido());
		System.out.println("> Precio Total: " + getPrecioPedido());
		System.out.println("> Precio Total con IVA: " + calcPrecioConIVA(precioPedido));
		System.out.println("> Total productos: " + getNumLineas());
		System.out.println("> ");
		
		
	}
	
	
	// METODO PARA CALCULAR PRECIO CON IVA
	private double calcPrecioConIVA(double precio) {
		
		double precioConIVA;
		
		precioConIVA = precio*((this.IVA+100)/10);
		
		return precioConIVA;
		
	}
	
	@Override
	public LocalDate getDate() {
		// TODO Auto-generated method stub
		return getfPedido();
	}


	public LocalDate getfPedido() {
		return this.fPedido;
	}


	public double getPrecioPedido() {
		return this.precioPedido;
	}


	public double getIVA() {
		return this.IVA;
	}


	
	public int getNumLineas() {
		
		
		return this.numLineas;
	}


	public List<LineaPedido> getLineasPedido() {
		return this.lineasPedido;
	}


	public Propietario getPropietario() {
		return this.propietario;
	}


	protected void setfPedido(LocalDate fPedido) {
		this.fPedido = fPedido;
	}
	
	// CONTAMOS LINEAS DEL ARRAY
	private void setNumLineas() {
		
		this.numLineas = lineasPedido.size();
		
	}

	// CALCULAMOS PRECIO TOTAL SIN IVA DEL ArrayList lineasPedido.
	private void setPrecioPedido() {
		
		double resultadoPrecioPedido;
		
		for (Iterator iterator = lineasPedido.iterator(); iterator.hasNext();) {
			LineaPedido lineaPedido = (LineaPedido) iterator.next();
			
		} 
		
		this.precioPedido = resultadoPrecioPedido;
	}


	protected void setIVA(double IVA) {
		this.IVA = IVA;
	}


	protected void setLineasPedido(List<LineaPedido> newLineasPedido) {
		
		if (this.lineasPedido == null) {
			
			this.lineasPedido = new ArrayList<LineaPedido>();
			
		}
		
		this.lineasPedido.addAll(newLineasPedido);
		
			
	}


	protected void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}


	@Override
	public String toString() {
		return "Pedido [fPedido=" + fPedido + ", precioPedido=" + precioPedido + ", IVA=" + IVA + ", numLineas="
				+ numLineas + ", lineasPedido=" + lineasPedido + ", propietario=" + propietario + "]";
	}
	
	 
	
	
}
