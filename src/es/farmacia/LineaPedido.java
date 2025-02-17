package es.farmacia;

public class LineaPedido {

	private int cantidad;
	private double descuento;
	private double precioLinea;
	private Producto producto;
	
	
	// CONSTRUCTORES
	public LineaPedido(int cantidad, Producto producto) {
		
		this.cantidad = cantidad;
		this.producto = producto;
		setPrecioLinea();
		// PONEMOS DESCUENTO A 0
		setDescuento(0);
		
	}
	
	public LineaPedido(int cantidad, double descuento, Producto producto) {
		
		this.cantidad = cantidad;
		this.producto = producto;
		setDescuento(descuento);
		setPrecioLinea();
		
	}
	
	
	
	public int getCantidad() {
		return cantidad;
	}

	public double getDescuento() {
		return descuento;
	}

	public double getPrecioLinea() {
		return precioLinea;
	}

	public Producto getProducto() {
		return producto;
	}

	
	
	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private void setPrecioLinea() {
		
		this.precioLinea = this.getProducto().getPrecio()*this.getCantidad()*(100-this.getDescuento())/100;
		
	}

	protected void setProducto(Producto producto) {
		this.producto = producto;
	}

	protected boolean setDescuento(double descuento) {
		
		boolean checkDescuento = true;
		
		// CHECK DESCUENTO ENTRE 0 y 100
		if (descuento > 100 || descuento < 0) {
			checkDescuento = false;
			this.descuento = 0;
			
		} else {
			
			this.descuento = descuento;
			
		}
		
		return checkDescuento;
		
	}

	@Override
	public String toString() {
		return "LineaPedido [cantidad=" + cantidad + ", descuento=" + descuento + ", precioLinea=" + precioLinea
				+ ", producto=" + producto + "]";
	}
	
	
	
}
