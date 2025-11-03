/*
Una empresa tiene 30 vendedores, y por cada vendedor se tiene el nombre y la venta que realizó. Elaborar un programa que permita leer dichos datos
y que proporcione un reporte de comisiones de ventas en el cual aparezcan todos los vendedores que tengan ventas mayores que el nivel de comisión,
el cual se calcula así:
Nivel de comisión = 3/4 * (promedio de ventas)
Comisión = 5 % sobre el excedente de lo que vendió por arriba del nivel de comisión.
COMISIONES DE VENDEDORES
NOMBRE DEL VENDEDOR                  VENTAS            COMISIÓN
XXXXXXXXXXXXXXXXXXXXXXXX        999,999.99        99,999.99
XXXXXXXXXXXXXXXXXXXXXXXX        999,999.99        99,999.99
        - -
XXXXXXXXXXXXXXXXXXXXXXXX        999,999.99        99,999.99
TOTAL 99 VENDEDORES                     9,999,999.99       999,999.99
 */
public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        double totalVendedores = 0;
        int[] vendedores = new int[30];
        String[] nombres = {"Santiago", "Juan", "Jorge", "Julian", "Axel", "Alex", "Alexander", "Pepe", "Walter", "Winky", "Frankenstein", "Isaac", "Tony",
        "Molly", "Hallie", "Carlos", "Karla", "Virgilio", "Bonnie", "Nami", "Zoro", "Oliver", "Mickey", "Fubuki", "Genos", "Saitama", "Jotaro", "Giorno",
        "Diavolo", "Buu"};
        double[] ventas = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        System.out.println("|| COMISION DE VENDEDORES ||\n");
        System.out.println("\nNOMBRE DEL VENDEDOR: \t\t\t VENTAS: \t\t\t COMISION:\n");
        double suma = 0;
        for (int i = 0; i < ventas.length; i++) {
             suma += ventas[i];
        }
        //System.out.println(suma);
        double promedio = suma / ventas.length;
        //System.out.println(promedio);
        double nivelDeComision = promedio * 0.75;
        //System.out.println(nivelDeComision);
        for (int i = 0; i < vendedores.length; i++) {
            double comision = 0;
            if(ventas[i] > nivelDeComision){
                double excedente = ventas[i]-nivelDeComision;
                 comision = excedente*0.05;
            }
            System.out.printf((i + 1) + ". " + "Vendedor: " + nombres[i] + "\t\t\t\t" + ventas[i] + "\t\t\t\t" + comision + "\n");
        }
    }
}