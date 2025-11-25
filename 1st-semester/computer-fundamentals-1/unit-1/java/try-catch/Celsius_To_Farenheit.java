import java.util.Scanner;

public class Celsius_To_Farenheit {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, farenheit;
        try {
            System.out.println("Enter a value in Celsius grades:");
            celsius = input.nextDouble();
            farenheit = (celsius * 9.0) / 5.0 + 32;
            System.out.println("Value in Farenheit grades: " + farenheit);
        } catch (Exception e) {
            System.out.println("ERROR. Only numbers are alloweed.");
        }
        input.close();
    }    
}
