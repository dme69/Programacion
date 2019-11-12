public class Pares {
	
	public static void main (String[] args) {
	int numero = 573;
	int contador;
	
	for (contador = 1; contador <= numero; contador++) {
		if (contador % 3 == 0 && contador % 15 == 0) {
			System.out.print (contador + " ");
			}
		}
	}
}
