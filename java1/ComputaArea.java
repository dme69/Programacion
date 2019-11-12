public class ComputaArea {
	public static final double  PI = 3.1416;
	
	public static void main (String[] args) {
	
		double radio, area;
		radio = 0;
		if (radio == 0) {
			System.out.println ("No puedo calcular este radio " + radio);
		}
		
		else if (radio <= -1) {
			radio = radio * -1;
			area = PI * radio * radio;
			System.out.println ("El area es " + area);
		}
		
		else {
			area = PI * radio * radio;
			System.out.println ("El area es " + area);
		}
	}
}
