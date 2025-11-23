import java.util.Scanner;

public class Natural_Numbers_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            int end;
            System.out.println("\nEnter a value for the end of the series: ");
            end = input.nextInt();
            int positive_constant = 1;
            if (end < 0) {
                System.out.println("ERROR. The limit of the series cannot be negative.");
            } else {
                do {
                    if (positive_constant < end) {
                        System.out.printf("%d, ", positive_constant++);
                    } else {
                        System.out.printf("%d.", positive_constant++);
                    }
                } while(positive_constant <= end);
            }
            System.out.println("\nAgain? Y/N");
            option = input.next();
        } while(option.equals("Y") || option.equals("y"));
        input.close(); 
    }
}