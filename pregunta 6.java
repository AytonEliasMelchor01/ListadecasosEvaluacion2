import java.util.ArrayList;   
import java.util.Collections; 
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class traducirpalabras  {
    
	public static void main(String[] args) {
	HashMap<String, String> diccionario = new HashMap<String, String>();
	Scanner entrada = new Scanner(System.in);
	ArrayList<String> diccionarioA = new ArrayList<String>();
	ArrayList<String> palabrasA = new ArrayList<String>();
	
	int contAciertos = 0 ;
	int contFallos = 0 ;
	diccionario.put("musica", "music");
    diccionario.put("perro", "dog");
    diccionario.put("gato", "cat");
    diccionario.put("go", "ir");
    diccionario.put("game", "juego");
    diccionario.put("radio", "radio");
    diccionario.put("phone", "celular");
    diccionario.put("circle", "círculo");
    diccionario.put("book", "libro");
    diccionario.put("song", "canción");
    diccionario.put("coin", "moneda");
    diccionario.put("tear", "lagrima");
    diccionario.put("light", "luz");
    diccionario.put("dark", "oscuro");
    diccionario.put("legend", "leyenda");
    diccionario.put("program", "programa");
    diccionario.put("glasses", "lentes");
    diccionario.put("computer", "computadora");
    diccionario.put("science", "ciencia");
    diccionario.put("life", "vida");
    diccionario.put("death", "muerte");
    diccionario.put("good", "bueno");
    diccionario.put("bad", "malo");
    diccionario.put("space", "espacio");
    diccionario.put("guitar", "guitarra");
    diccionario.put("piano", "piano");
    diccionario.put("black", "negro");
    diccionario.put("white", "blanco");
    diccionario.put("orange", "naranja");
    diccionario.put("apple", "manzana");
    
	diccionarioA.addAll(diccionario.keySet());
	Collections.shuffle(diccionarioA);
	for (int i = 0; i < 5 ; i++){
	    palabrasA.add(diccionarioA.remove(0));
	}
	for(String x: palabrasA){
	  String respuesta = "";
      System.out.println("Introduzca la traducción de la palabra "+x+": ");
      respuesta = entrada.nextLine();
       if (respuesta.contains(diccionario.get(x))) {
        contAciertos++;
      } else {
        contFallos++;
      }
      System.out.println("Has acertado " + contAciertos + " palabras y has fallado " + contFallos + " palabras.");
	}
	}
}
