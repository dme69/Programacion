public class Calculadora {
	public static void main (String[] args) {
		
		String operacion = args [0];
		double valor1 = Double.parseDouble(args[1]);
		double valor2 = Double.parseDouble(args[2]);
		double resultado = 0;
		
		switch (operacion) {
			case "suma":
				resultado = valor1 + valor2;
				break;
			case "resta":
				resultado = valor1 - valor2;
				break;
			case "multiplicacion":
				resultado = valor1 * valor2;
				break;
			case "division":
				resultado = valor1 / valor2;
				break;
			default:
				System.out.println("Operacion no valida");
		}
		
		System.out.println("El resultado es " + resultado);
	}
}
