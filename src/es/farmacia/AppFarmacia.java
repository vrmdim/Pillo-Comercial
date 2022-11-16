package es.farmacia;

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
		
		
		
	}

}
