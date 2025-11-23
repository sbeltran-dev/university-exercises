import java.util.Scanner;

public class Geometric_Series {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            System.out.println("Enter a value for the constant variable: ");
            int positive_constant = input.nextInt();
            System.out.println("Enter a value for the end of the series: ");
            int end = input.nextInt();
            if (end < 0) {
                System.out.println("ERROR. Only positive integer allowed.");
            } else {
                do {
                    if (positive_constant < end) {
                        System.out.printf("%d, ", positive_constant);
                    } else {
                        System.out.printf("%d.", positive_constant);
                    }
                    positive_constant *= 2;
                } while (positive_constant <= end);
            }
            System.out.println();
            System.out.println("Again? Y/N");
            option = input.next();
        } while (option.equals("Y") || option.equals("y"));
        input.close();
    }

}
