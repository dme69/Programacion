public class TestUnidades {
	
	public static void main (String[] args) {
		double libras = 2.25;
		double kilogramos = Unidades.convertirAKilos (libras);
		System.out.println (libras + " libras son " + kilogramos);
		
		double pies = 2.00;
		double metros = Unidades.convertirAMetros (pies);
		System.out.println (pies + " pies son " + metros);
		
		double yardas = 3.40;
		double metros2 = Unidades.convertirAMetros2 (yardas);
		System.out.println (yardas + " yardas son " + metros2);
		
		double millas = 5.15;
		double metros3 = Unidades.convertirAMetros3 (millas);
		System.out.println (millas + " millas son " + metros3);
		
		double acres = 2.66;
		double hectareas = Unidades.convertirAHectareas (acres);
		System.out.println (acres + " acres son " + hectareas);
		
		double onzas = 1.29;
		double mililitros = Unidades.convertirAMililitros (onzas);
		System.out.println (onzas + " onzas son " + mililitros);
		
		double galones = 6.00;
		double litros = Unidades.convertirALitros (galones);
		System.out.println (galones + " galones son " + litros);
		
	}
}

