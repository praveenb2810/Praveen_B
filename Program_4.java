import java.util.*;

public class Program_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> result = new HashMap<>();

        // For each divisor 1 to 9
        for (int k = 1; k <= 9; k++) {
            int count = 0;
            for (int num : numbers) {
                if (num % k == 0) {
                    count++;
                }
            }
            result.put(k, count);
        }

        // Print result
        System.out.println(result);
    }
}
