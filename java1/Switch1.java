public class Switch1 {
	public static void main (String[] args) {
		int diasFuturo = 1700;
		int diaActual = 2;
		int resto = (diasFuturo + diaActual) % 7;
		String dia = " ";
		switch (resto){
			case 0:
				dia = "Domingo";
				break;
			case 1:
				dia = "Lunes";
				break;
			case 2:
				dia = "Martes";
				break;
			case 3:
				dia = "Miercoles";
				break;
			case 4:
				dia = "Jueves";
				break;
			case 5:
				dia = "Viernes";
				break;
			default:
				dia = "Sabado";
		}
		System.out.println("Dentro de " + diasFuturo + " dias, sera " + dia);
	}
}
