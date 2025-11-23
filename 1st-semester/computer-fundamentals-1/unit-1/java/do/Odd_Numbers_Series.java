import java.util.Scanner;

public class Odd_Numbers_Series {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            int number = 1, end;
            System.out.println("Enter a value for the end of the series: ");
            end = input.nextInt();
            if (end < 0) {
                System.out.println("ERROR. Only positive integers are allowed.");
            } else {
                do {
                    if (number < end) {
                        System.out.printf("%d, ", number);
                    } else {
                        System.out.printf("%d.", number);
                    }
                    number += 2;
                } while (number <= end);
            }
            System.out.println("\nAgain? Y/N");
            option = input.next();
        } while (option.equals("Y") || option.equals("y"));
        input.close();
    }
}
