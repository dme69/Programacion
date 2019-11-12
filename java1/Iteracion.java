public class Iteracion {

	public static void main (String[] args) {
		int numero = -5;
		int suma = 1;
		int contador = 1;
	
		if (numero < 0) {
			numero *=-1;
		}
	
		while (contador <= numero) {
		suma = suma * contador;
		contador++;
		}
		
		System.out.println ("Numero: " + numero);
		System.out.println ("Suma: " + suma);
		System.out.println ("Contador: " + contador);
	}

}
