/*
Desarrollar un programa en Java que solicite al usuario una palabra y determine si es palíndromo. La verificación debe de ignorar mayúsculas y minúsculas
para evitar que sea insensible a la capitalización.

Resolverlo de 2 maneras diferentes:

>> Solucion 1. Que use arreglos de tipo carácter.
2. Que use StringBuilder (investigar como se utiliza).
 */
import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palabra = "reconocer";
        boolean palindromo = true; // > Establecemos que la palabra si es un palindromo.
        char[] caracteres = palabra.toCharArray(); // > Aqui es donde se crea el array.
        for (int i = 0; i < caracteres.length/2; i++) { // > Al 'caracteres.length' se le pone un /2
            if (caracteres[i] != caracteres[(caracteres.length - i - 1)]) {
                System.out.println("LA PALABRA NO ES UN PALINDROMO.");
                palindromo = false; // > Aqui se convierte en 'false'
                break; // > Para cerrar el ciclo.
            }
        }
        if (palindromo == true) {
            System.out.println("LA PALABRA SI ES UN PALINDROMO.");
        }
    }
}

/*
 El array funciona de la siguiente manera:
 Cuando se crea el array, en cada corchete de la posicion se guarda un dato. Por ejemplo, caracteres[0] guarda el caracter 'r'
        Posición:  [0] [1] [2] [3] [4] [5] [6] [7] [8] >> Importante: Los arreglos SIEMPRE empiezan en 0, pero en total son 9 posiciones.
 -DATO: Carácter:  [r] [e] [c] [o] [n] [o] [c] [e] [r]


 Al caracteres.length/2 se le pone un dos porque queremos que solo recorra la mitad del arreglo. En este caso, al ser un numero total de 8 posiciones,
 solo va a recorrer hasta el 4 porque es la mitad de 8, y eso es lo que esta haciendo el caracteres.length/2.
 Si no hacemos esa division, va a pasar esto:

 i = 0: comparar pos 0 con pos 8 → r con r
 i = 1: comparar pos 1 con pos 7 → e con e
 i = 2: comparar pos 2 con pos 6 → c con c
 i = 3: comparar pos 3 con pos 5 → o con o
 i = 4: comparar pos 4 con pos 4 → n con n
 i = 5: comparar pos 5 con pos 3 → o con o  - Innecesario
 i = 6: comparar pos 6 con pos 2 → c con c  - Innecesario
 i = 7: comparar pos 7 con pos 1 → e con e  - Innecesario
 i = 8: comparar pos 8 con pos 0 → r con r  - Innecesario

 En la linea 18:
 La operacion (caracteres.length-i-1) se hace porque sabemos que caracteres.length = 9, y le estamos restando 'i' para movernos hacia "atras"
 i = 0: 9 - 1 - 0 = 8
 i = 1: 9 - 1 - 1 = 7
 i = 2: 9 - 1 - 2 = 6
 Como sabemos que el length es 9, tambien le restamos el -1 del final de la operacion para que se reste esa posicion 9 inexistente. Asi es como:
 length - 1 = 9-1 = 8 POSICIONES
 */