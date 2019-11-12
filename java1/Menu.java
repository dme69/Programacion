import java.util.Scanner;

public class Menu {
	public static void main (String[] args) {
		int accion;
		do {
		System.out.println("0-Salir");
		System.out.println("1-Añadir usuario");
		System.out.println("2-Eliminar usuario");
		System.out.println("3-Modificar usuario");
		System.out.println("4-Actualizar usuario");
		System.out.println("***********************");
		System.out.println("Elige una opción");
		
		Scanner sc = new Scanner(System.in);
		accion = sc.nextInt();
		switch (accion){
			case 0:
				System.out.println("Salir");
				break;
			case 1:
				System.out.println("Añadir usuario");
				break;
			case 2:
				System.out.println("Eliminar usuario");
				break;
			case 3:
				System.out.println("Modificar usuario");
				break;
			default:
				System.out.println("Actualizar usuario");
		}
		} while (accion != 0);
	}
}
