import java.util.Scanner;

public class Power_Number_Series {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            int number = 1, power_number, end;
            System.out.println("Input a number to establish the end of the series: ");
            end = input.nextInt();
            System.out.println("Input the power number: ");
            power_number = input.nextInt();
            do {
                if (number < end) {
                    System.out.printf("%d, ", number);
                } else {
                    System.out.printf("%d.", number);
                }
                number *= power_number;
            } while (number <= end);
            System.out.println("\nAgain? Y/N");
            option = input.next();
        } while (option.equals("Y") || option.equals("y"));
        input.close();
    }    
}
