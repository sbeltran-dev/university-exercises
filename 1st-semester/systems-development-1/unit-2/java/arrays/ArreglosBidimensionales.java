/*
Una compañía manufacturera tiene 12 plantas. Elaborar un programa que permita leer el nombre de cada planta y la producción que se hizo en cada
uno de los siete días de la semana. Utilizar un arreglo de una dimensión para leer los nombres de las plantas y un arreglo de dos dimensiones (12 x 7)
para leer la producción de las doce plantas (uno en cada renglón) en los siete días, una columna para cada día. La idea es leer el nombre de la primera planta y
luego la producción hecha en cada uno de los siete días, luego procesar la planta 2, posteriormente la 3 y así sucesivamente. Imprimir el siguiente reporte:
REPORTE SEMANAL DE PRODUCCCIÓN
PLANTA    DÍA 1 DÍA 2 DÍA 3 DÍA 4 DÍA 5 DÍA 6 DÍA 7 PROD. SEMANAL
XXXXXXX  999    999    999    999    999    999   999     999
XXXXXXX  999    999    999    999    999    999   999     999
---
XXXXXXX  999    999    999    999    999    999   999     999
TOTAL                                                                            9999
PLANTA MÁS PRODUCTIVA: XXXXXXXXXXXXXXXXXXXXXXXXX
PRODUCCIÓN DE LA PLANTA MÁS PRODUCTIVA: 999
DÍA CON MAYOR PRODUCCIÓN: 999
MAYOR PRODUCCIÓN EN UN DÍA: 999
 */
public class ArreglosBidimensionales {
    public static void main (String [] args) {
        String[] plantas = {"Atomic", "Nucle", "Gas", "Scien", "Math", "Elecs", "Engin", "Stark", "NVIDIA", "Intel", "AMD", "ASUS"};
        int[][] produccionDia = new int[12][7];
        double[] ventasDia1 = {2800, 4000, 840, 600, 3000, 9800, 60, 140, 250, 10000, 4000, 2750, 2700, 1000};
        double[] ventasDia2 = {300, 4200, 8450, 600, 4000, 5800, 6000, 140, 250, 8000, 4000, 2750, 2600, 2000};
        double[] ventasDia3 = {2300, 700, 870, 600, 200, 5800, 700, 140, 250, 10000, 4000, 2750, 2300, 3000};
        double[] ventasDia4 = {800, 800, 500, 700, 3800, 400, 800, 140, 250, 11000, 4000, 2750, 2900, 4000};
        double[] ventasDia5 = {1100, 9000, 840, 800, 2600, 2000, 1000, 140, 250, 12000, 4000, 2750, 2700, 5000};
        double[] ventasDia6 = {3600, 100, 1000, 900, 700, 9600, 69000, 140, 250, 10000, 4000, 2750, 3000, 1000};
        double[] ventasDia7 = {2800, 450, 850, 1000, 3000, 300, 6000, 140, 250, 7000, 4000, 2750, 7600, 1200};
        double[] produccionSemanal = {10000, 20000, 360000, 58000, 98000, 78364, 93472, 28324, 78000, 8237, 94858, 10000};
        System.out.println("\n|| REPORTE SEMANAL DE PRODUCCION ||\n");
        System.out.println("PLANTAS: \t\t\t\t DIA 1: \t\t DIA 2: \t\t DIA 3: \t\t DIA 4: \t\t DIA 5: \t\t DIA 6: \t\t DIA 7: \t\t PRODUCCION SEMANAL:");
        for (int i = 0; i < plantas.length; i++) {
            System.out.println(i + ". " + plantas[i] + ": " + "\t\t\t\t" + ventasDia1[i] + "\t\t\t\t" + ventasDia2[i] + "\t\t\t" + ventasDia3[i] + "\t\t\t" + ventasDia4[i] + "\t\t\t" + ventasDia5[i] + "\t\t\t" + ventasDia6[i] + "\t\t\t" + ventasDia7[i] + "\t\t\t\t" + produccionSemanal[i]);
        }
        // > Profe la verdad no supe bien como sacar los calculos totales, estuve investigando en google y ninguna solucion me dio bien. Para la tarea del arreglo
        // unidimensional les dije si me podian ayudar con el total y no me supieron decir como. Vi el documento que compartio pero no entendi muy bien los metodos.
        //
        System.out.println("Planta mas productiva: " + plantas[2]);
        System.out.println("Produccion de la planta mas productiva: " + produccionSemanal[2]);
        System.out.printf("Dia con mayor produccion: DIA 6.");
        System.out.println("Mayor produccion en un dia: " + ventasDia6[6]);
    }
}
