import java.util.Scanner;

public class Program_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number (x): ");
        int x = sc.nextInt();

        // Generate and print first x odd numbers
        for (int i = 1; i <= x; i++) {
            int oddNumber = 2 * i - 1; // Formula for ith odd number
            if (i < x) {
                System.out.print(oddNumber + ", ");
            } else {
                System.out.print(oddNumber); // Last number without trailing comma
            }
        }

        sc.close();
    }
}
