public class Iteracion1 {

	public static void main (String[] args) {
		int numero = 5;
		int suma = 0;
		int contador = 0;
	
		do {
		suma = suma + contador;
		contador++;
		}
		while (contador <= numero);
		
		System.out.println ("Numero: " + numero);
		System.out.println ("Suma: " + suma);
		System.out.println ("Contador: " + contador);
	}

}
