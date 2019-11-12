public class Moneda {
	
	public static void main (String[] args) {
		//crear una variable que guarde euros
		double euro = 125.26;
		
		//crear variable que guarde dolares
		double dolar = 125.26;
		
		//llamar a los metodos para que convierta
		convertirADolares (euro);
		double cambio = convertirAEuro (dolar);
		System.out.println (cambio);
	}
	
	//metodo que convierta euros a dolares
	public static void convertirADolares (double eurosAConvertir) {
		final double CONVERSOR = 1.11;
		double dolares = CONVERSOR * eurosAConvertir;
		System.out.println (eurosAConvertir);
	}
	
	//metodo que convierta dolares a euro
	public static double convertirAEuro (double dolaresAConvertir) {
		final double CONVERSOR = 0.9;
		double euros = CONVERSOR * dolaresAConvertir;
		return euros;
	}
}

