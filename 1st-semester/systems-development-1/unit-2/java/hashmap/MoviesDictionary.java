/*
Crear un programa en Java que permita leer 20 nombres de películas y la duración de la película, debe de guardarse en un diccionario hashmap.
Imprimir el diccionario y luego pedir al usuario que introduzca un nombre de película y aparezca su duración.
*/
import java.util.HashMap;
import java.util.Scanner;
public class MoviesDictionary {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> movies = new HashMap<>();
        String movieName;
        int movieDuration;
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce a movie name: ");
            movieName = input.next();
            System.out.println("Duration: ");
            movieDuration = input.nextInt();
            movies.put(movieName, movieDuration);
        }
        System.out.println(movies);
        System.out.println("Type a movie name: ");
        movieName = input.next();
        if (movies.containsKey(movieName)) {
            movieDuration = movies.get(movieName);
            System.out.println("Movie duration: " + movieDuration);
        } else {
            System.out.println("That movie isn't in the dictionary.");
        }
        input.close();
    }
}
