import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class minidiccionario{
    
    public static void main(String[] args){
        
        HashMap<String, String> diccionario = new HashMap<String, String>();
        Scanner entrada = new Scanner (System.in);
        
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
        
        System.out.println("Introduce una palabra para traducir a ingles: ");
        String palabra = entrada.next();
        if(diccionario.containsKey(palabra)){
            System.out.print("La palabra "+ palabra + " en ingles es: ");
            System.out.println(diccionario.get(palabra));
            
        }
            else{
            System.out.println("la palabra no existe en el diccionario");
            }
        
    }
} 
