import java.util.Scanner;

public class Fractions_Summation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a value for the limit of the series: ");
            int limit = input.nextInt();
            if (limit > 0) {
                System.out.println("Summation: ");
                double numerator = 1, denominator = 1, result = 0;
                result += numerator / denominator;
                while (denominator < limit) {
                    System.out.printf("%.0f/%.0f + ", numerator, denominator);
                    denominator++;
                    result += numerator / denominator;
                } 
                System.out.printf("%.0f/%.0f.", numerator, denominator);
                System.out.printf("\nResult: %.3f\n", result);
            } else {
                System.out.println("ERROR. The limit of the series cannot be negative.");
            }
        } catch (Exception e) {
            System.out.println("ERROR. Not a number.");
        }
        input.close();
    }    
}
