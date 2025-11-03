/*
Elaborar un programa para leer 30 días de ventas realizadas por un empleado y que imprima el día en que tuvo la mayor y la menor venta, así como las
cantidades correspondientes.
Al final debe imprimir:
 TOTAL DE ELEMENTOS ARRIBA DE LA MEDIA: 999
 TOTAL DE ELEMENTOS ABAJO DE LA MEDIA: 999
 TOTAL DE ELEMENTOS IGUAL A LA MEDIA: 999
 */
import java.util.Scanner;
public class diasVentas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[] diasVenta = new int[30];
        int contadorMayores = 0;
        int contadorMenores = 0;
        int contadorIguales = 0;
        double total = 0;
        double media;
        System.out.println("Introduzca nombre del empleado: ");
        String nombre = input.nextLine();
        for (int i = 0; i < 30; i++) {
            System.out.println("Ventas del dia " + (i + 1) + " que tuvo el empleado " + nombre + ": ");
            diasVenta[i] = input.nextInt();
            total += diasVenta[i];
        }
        System.out.println("TOTAL DE VENTAS: " + total);
        media = total / diasVenta.length;
        System.out.printf("MEDIA DE VENTAS: %.0f\n", media);
        for (int ventas : diasVenta) {
            if (ventas > media) {
                contadorMayores++;
            } else if (ventas < media) {
                contadorMenores++;
            } else {
                contadorIguales++;
            }
        }
        System.out.println("TOTAL DE ELEMENTOS ARRIBA DE LA MEDIA: " + contadorMayores);
        System.out.println("TOTAL DE ELEMENTOS ABAJO DE LA MEDIA: " + contadorMenores);
        System.out.println("TOTAL DE ELEMENTOS IGUALES A LA MEDIA: " + contadorIguales);
        input.close();
    }
}
