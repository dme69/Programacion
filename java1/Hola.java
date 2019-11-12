import java.util.Scanner;

public class Hola {
	public static void main (String[] args) {
		String saludo;
		System.out.printf("Introduzca su nombre%n");
		Scanner sc = new Scanner(System.in);
		saludo = sc.nextLine();
		System.out.printf("Hola %s%n", saludo);
	}


}
