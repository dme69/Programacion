public class Iteracion2 {
	
	public static void main (String[] args) {
	int numero = 1001120;
	int contadorMultiplo = 0;
	
	for (int i = 1; i < numero; i++) {
		if (numero % i == 0) {
			System.out.println (i + " es divisor " + numero);
			contadorMultiplo++;
			}
		if (contadorMultiplo == 10) {
			break;	
			}
		}
	}
}
