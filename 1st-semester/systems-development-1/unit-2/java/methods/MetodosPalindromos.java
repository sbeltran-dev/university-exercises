/*
Desarrollar un programa en Java que solicite al usuario una palabra y determine si es palíndromo. La verificación debe de ignorar mayúsculas y minúsculas
para evitar que sea insensible a la capitalización.

Utilizar métodos, que devuelva un boolean (true o false) para ser utilizado en un if y si devuelve true, imprimir es Palindromo y si no No es palindromo.
*/
import java.util.Scanner;
public class MetodosPalindromos {
    public static void main(String[] args) {
        // > Llamamos al metodo para que se imprima en el bloque principal.
        leerPalindromo();
    }
    // > Leemos la palabra
    public static void leerPalindromo () {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabraOriginal = input.nextLine().toLowerCase();
        StringBuilder palabra = new StringBuilder(palabraOriginal);
        palabra.reverse();
        String palabraInvertida = palabra.toString();
        // > Llamamos al metodo imprimimos para imprimir el resultado dentro del bloque.
        imprimimos(palabraOriginal, palabraInvertida);
    }
    // > Para imprimir si es palindromo o no.
    public static void imprimimos (String palabraOriginal, String palabraInvertida) {
        if  (palabraOriginal.equals(palabraInvertida)) {
            System.out.println(palabraOriginal + " si es palindromo.");
        } else {
            System.out.println(palabraOriginal + " no es palindromo.");
        }
    }
}
