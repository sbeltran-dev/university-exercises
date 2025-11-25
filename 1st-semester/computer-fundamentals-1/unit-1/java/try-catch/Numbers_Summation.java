import java.util.Scanner;

public class Numbers_Summation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a value for the limit of the series: ");
            int limit = input.nextInt();
            if (limit > 0) {
                System.out.println("Summation: ");
                int i = 1;
                while (i < limit) {
                    System.out.printf("%d + ", i);
                    i++;
                }
                System.out.printf("%d.\n", limit);
                int result = (limit * (limit + 1)) / 2;
                System.out.printf("Result: %d\n", result);
            } else {
                System.out.println("ERROR. Limit cannot be a negative number.");
            }
        } catch (Exception e) {
            System.out.println("ERROR. Not a number.");
        }
        input.close();
    }    
}
