/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.HashMap;
import java.util.Scanner;

public class ControlAcceso {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Almacenamos los nombres de usuario y contraseñas en un HashMap
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("user1", "1234");
        usuarios.put("user2", "1234");
        usuarios.put("user3", "1234");

        // Contador de intentos
        int intentos = 0;

        // Bucle para solicitar las credenciales del usuario
        while (intentos < 3) {
            System.out.print("Introduce el nombre de usuario: ");
            String usuario = s.next();
            System.out.print("Introduce la contraseña: ");
            String contraseña = s.next();

            // Verificamos si las credenciales son correctas
            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)) {
                System.out.println("Ha accedido al área restringida.");
                break;
            } else {
                System.out.println("Error durante la comprobación. Por favor " +
                        "vuelva a intentarlo.\n");
                intentos++;
            }
        }

        // Si se agotan los intentos, se muestra un mensaje de error
        if (intentos == 3) {
            System.out.println("Lo siento, no tiene acceso al área restringida.");
        }
    }
}
