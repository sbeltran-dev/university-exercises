import java.util.Scanner;

public class Even_Numbers_Series {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a number for the limit of the series: ");
            int limit = input.nextInt();
            if (limit > 0) {
                int number = 0;
                while (number < limit) {
                    System.out.printf("%d, ", number);
                    number += 2;
                }
                System.out.printf("%d.", number);
            } else {
                System.out.println("ERROR. Limit must be a positive number.");
            }
        } catch (Exception e) {
            System.out.println("ERROR. Not a number.");
        }
        input.close();
    }    
}
