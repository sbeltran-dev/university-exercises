import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            int result = number % 2;
            if (result == 0 && number > 0) {
                System.out.println("Positive even number.");
            } else if (result == 0 && number < 0) {
                System.out.println("Negative even number.");
            } else if (number == 0) {
                System.out.println("Zero.");
            } else if (result == 1) {
                System.out.println("Odd number.");
            }
        } catch (Exception e) {
            System.out.println("ERROR. Not a number.");
        }
        input.close();
    }    
}
