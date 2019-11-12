public class Numeros {

	public static void main (String[] args) {
		//numeros1a10();
		//numeros1a102();
		//numeros5a5();
		//numeros5a52();
		//numeros100a50();
		suma1aN(7);
	}
	
	public static void numeros1a10() {
		int contador = 1;
		while (contador <= 10) {
			System.out.println ("Numero: " + contador);
			contador++;
		}
	
	}
	
	public static void numeros1a102() {
		int contador = 1;
		do {
			System.out.println ("Numero: " + contador);
			contador++;
		}
		while (contador <= 10);
	
	}
	
	public static void numeros5a5() {
		int contador = 20;
		while (contador <= 80) {
			System.out.println ("Numero: " + contador);
			contador += 5;
		}
	
	}
	
	public static void numeros5a52() {
		int contador = 20;
		do {
			System.out.println ("Numero: " + contador);
			contador += 5;
		}
		
		while (contador <= 80);
	
	}
	
	public static void numeros100a50() {
		int contador = 100;
		while (contador >= 50) {
			System.out.println ("Numero: " + contador);
			contador -= 2;
		}
	
	}
	
	public static int suma1aN (int numero) {
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += i;
			//System.out.println("El resultado es " + suma);
		}
		System.out.println("El resultado es " + suma);
		return suma;
	}
}
