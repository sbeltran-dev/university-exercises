/*
Desarrollar un programa en Java que solicite al usuario una palabra y determine si es palíndromo. La verificación debe de ignorar mayúsculas y minúsculas
para evitar que sea insensible a la capitalización.

Resolverlo de 2 maneras diferentes:

1. Que use arreglos de tipo carácter.
>> Solucion 2. Que use StringBuilder (investigar como se utiliza).
*/
import java.sql.SQLOutput;
import java.util.Scanner;
public class Palindromo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba una palabra: ");
        String palabraOriginal = input.nextLine().toLowerCase(); // > Convertimos a minusculas.
        StringBuilder palabra = new StringBuilder(palabraOriginal);
        palabra.reverse();
        String palabraInvertida = palabra.toString(); // > Invertimos.
        if  (palabraOriginal.equals(palabraInvertida)) {
            System.out.println("LA PALABRA ES UN PALINDROMO.");
        } else {
            System.out.println("LA PALABRA NO ES UN PALINDROMO.");
        }
    }
}

/*
 Que es un StringBuilder?
 Sirve para manipular una variable de tipo String de forma mas eficiente. Tiene metodos como .reverse() para invertir el dato introducido a la variable.
 Tambien esta el .equals() para comparar si el dato de la variable String es el mismo que el que se invertio.

 Otra opcion con la misma funcion que el .equals(); es el .compareTo(); se diferencia en que te va a devolver un 0 ('false') o 1 ('true') como respuesta.
 Tambien existe otra version del .compareTo(); >> .compareToIgnoreCase(); para ignorar mayusculas.
*/