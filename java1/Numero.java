/**
* Esta clase define objetos que contienen
* un atributo denominado ńumero
* y posee un ḿetodo para devolver
* el valor doble
* @author Manuel Molino
* @version 1.0
*/

public class Numero{
	private int numero; //propiedad de los objetos.
	
	/**
	* Constructor: es un m ́etodo que tiene
	* el mismo nombre que la clase y se
	* usa para crear objetos
	* @param n parametro para inicializar el objeto
	* se usa para inicializar los objetos
	* de tipo numero
	*/
	
	public Numero(int n){
		this.numero=n;
	}
	
	/**
	* ḿetodo que devuelve el valor doble
	* @return el valor doble del atributo
	* numero de dicho objeto.
	*/
	
	public int calcularDoble(){
		return this.numero*2;
	}
	
	/**
	* ḿetodo que devuelve el valor triple
	* @return el valor doble del atributo
	* numero de dicho objeto.
	*/
	
	public int calcularTriple(){
		return this.numero*3;
	}
	
	/**
	* ḿetodo que devuelve el valor mitad
	* @return el valor doble del atributo
	* numero de dicho objeto.
	*/
	
	public int calcularMitad(){
		return this.numero/2;
	}
}

//clase para comprobar el funcionamiento de la
//clase anterior

class TestNumeros {
	public static void main(String[] arg){
		//Creo uno objeto de tipo Ńumero
		Numero n1 = new Numero(5);
		//Imprimo su valor doble
		System.out.println("Valor doble: "+n1.calcularDoble());
		System.out.println("Valor triple: "+n1.calcularTriple());
		System.out.println("Valor mitad: "+n1.calcularMitad());
	}
}
