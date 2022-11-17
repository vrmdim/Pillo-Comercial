package es.farmacia;

import java.util.ArrayList;
import java.util.List;

public class AppFarmacia {

	public static void main(String[] args) {
		
		/**
		 * Flujo programa principal
		 */
		
		// CREAMOS COOPERATIVAS
		Cooperativa cooperativaAstorga = new Cooperativa("Cooperativa Astorga");
		Cooperativa cooperativaSalmantina = new Cooperativa("Cooperativa Salmantina");
		
		
		// CREAMOS PoC's
		PoC contactoAstorga = new PoC("Antonio", "+34 666777888");
		PoC contactoSalamancaC = new PoC("Pedro", "+34 645 78 98");
		

		// CREAMOS NEGOCIO
		Negocio negocioLeon = new Negocio("Negocios Leon SL",contactoAstorga, cooperativaAstorga);
		
		// CREAMOS PROPIETARIO
		Propietario amancioPropietario = new Propietario("Amancio", "55786489-H", negocioLeon);
		
		
		// CREAMOS PRODUCTO
		Producto paracetamol = new Producto("Paracetamol Generico", 2.5);
		Producto ibuprofeno = new Producto("Ibuprofeno", 2.5);
		Producto mascarillas = new Producto("Pack 50 mascarillas FP2", 10);
		
		
		// CREAMOS LINEAS PEDIDO
		LineaPedido lineaParacetamol = new LineaPedido(2, paracetamol);
		LineaPedido lineaIbuprofeno = new LineaPedido(2, ibuprofeno);
		// HACEMOS DESCUENTO DEL 10%
		LineaPedido lineaMascarillas = new LineaPedido(1, 10, mascarillas);
		
		// ADD LINEAS A ARRAYLIST
		List<LineaPedido> listaLineasPedido = new ArrayList<>();
		listaLineasPedido.add(lineaParacetamol);
		listaLineasPedido.add(lineaIbuprofeno);
		listaLineasPedido.add(lineaMascarillas);
	
		
		// CREAMOS PEDIDO
		Pedido pedidoAmancio1 = new Pedido(listaLineasPedido, amancioPropietario);
		
		// IMPRIMIMOS PEDIDO
		pedidoAmancio1.imprimirPedido();
		
		
		// IMPRIMIMOS LISTA DE PEDIDOS DEL PROPIETARIO
		System.out.println(amancioPropietario.getPedidos().toString());
		
		
	}

}

















