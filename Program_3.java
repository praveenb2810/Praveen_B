import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // If a is even, reduce it by 1
        int terms = (a % 2 == 0) ? a - 1 : a;

        // Generate and print series
        for (int i = 1; i <= terms; i++) {
            int oddNumber = 2 * i - 1;  // formula for odd number
            if (i < terms) {
                System.out.print(oddNumber + ", ");
            } else {
                System.out.print(oddNumber); // no trailing comma
            }
        }

        sc.close();
    }
}
    

