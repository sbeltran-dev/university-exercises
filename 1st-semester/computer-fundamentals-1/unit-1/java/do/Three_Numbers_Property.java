import java.util.Scanner;

public class Three_Numbers_Property {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            System.out.println("\nEnter a number: ");
            int number = input.nextInt();
            System.out.println("\n|| OPERATION ||\n");
            int numerator = number * 111;
            int denominator = number + number + number;
            int result = numerator / denominator;
            System.out.printf("%d\n---\n%d", numerator, denominator);
            System.out.printf("\nResult = %d\n", result);
            System.out.println("\nAgain? Y/N");
            option = input.next();
        } while (option.equals("Y") || option.equals("y"));
        input.close();
   } 
}
