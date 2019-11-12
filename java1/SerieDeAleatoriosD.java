import java.util.ArrayList;
import java.util.Random;

/**
* Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
* @author: Mario R. Rancel
* @version: 22/09/2016/A
* @see <a href = "http://www.aprenderaprogramar.com" /> aprenderaprogramar.com { Did ́actica en programaci ́on </a>
*/

public class SerieDeAleatoriosD {
//Campos de la clase
private ArrayList<Integer> serieAleatoria;

/**
* Constructor para la serie de n ́umeros aleatorios
* @param numeroItems El par ́ametro numeroItems define el n ́umero de elementos que va a tener la serie aleatoria
*/

public SerieDeAleatoriosD (int numeroItems) {
serieAleatoria = new ArrayList<Integer> ();
for (int i=0; i<numeroItems; i++) {  serieAleatoria.add(0);  }
System.out.println ("Serie inicializada. El n ́umero de elementos en la serie es: " + getNumeroItems() );
} //Cierre del constructor

/**
* M ́etodo que devuelve el n ́umero de  ́ıtems (n ́umeros aleatorios) existentes en la serie
* @return El n ́umero de  ́ıtems (n ́umeros aleatorios) de que consta la serie
*/

public int getNumeroItems() { return serieAleatoria.size(); }

/**
* M ́etodo que genera la serie de n ́umeros aleatorios
*/

public void generarSerieDeAleatorios () {
Random numAleatorio;
numAleatorio = new Random ();
for (int i=0; i < serieAleatoria.size(); i++) { serieAleatoria.set(i, numAleatorio.nextInt(1000) ); }
System.out.print ("Serie generada! ");
} //Cierre del m ́etodo

} //Cierre de la clase y del ejemplo aprenderaprogram
