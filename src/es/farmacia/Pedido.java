package es.farmacia;

import java.time.LocalDate;
import java.util.ArrayList;
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
		setPrecioPedido();
		
	}

	public void imprimirPedido() {
		
		System.out.println("----------------------");
		System.out.println("- RESUMEN DEL PEDIDO -");
		System.out.println("----------------------");
		System.out.println();
		System.out.println("> Fecha Pedido: " + getfPedido());
		System.out.println("> Precio Total: " + getPrecioPedido() + "Euros.");
		System.out.println("> Precio Total con IVA: " + calcPrecioConIVA(precioPedido) + "Euros.");
		System.out.println("> Total productos: " + getNumLineas());
		System.out.println("> Desglose precios:");
		// Precio sin IVA de cada linea
		for (LineaPedido lineaPedido : lineasPedido) {
			System.out.println("   >>> " + lineaPedido.getCantidad() + " x " + lineaPedido.getProducto().getNombre()
					+ " = " + lineaPedido.getPrecioLinea() + " Euros.");
		}
		System.out.println("> " + getPropietario().getNombre());
		System.out.println("> Cooperativa: " + getPropietario().getNegocio().getCooperativa().getNombre());

		
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
		
		double resultadoPrecioPedido = 0;
		
		for (LineaPedido lineaPedido : lineasPedido) {
			
			resultadoPrecioPedido += lineaPedido.getPrecioLinea();
			
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
