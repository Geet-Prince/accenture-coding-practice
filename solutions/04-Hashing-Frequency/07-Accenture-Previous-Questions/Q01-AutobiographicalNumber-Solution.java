/*
SOLUTION: ACC-HASH-H01 — Autobiographical Number (CONFIRMED 3-year)
Approach:
1. Build frequency array freq[10] counting each digit 0-9
2. For each index i, check if digit at i == freq[i]
3. If all match, count distinct digits (freq[i] > 0) and return that count
*/
import java.util.*;

public class Q01AutobiographicalNumberSolution {

    public static int autoCount(String str) {
        if (str == null || str.isEmpty()) return 0;
        int n = str.length();
        int[] freq = new int[10];

        // Count frequency of each digit
        for (char c : str.toCharArray()) freq[c - '0']++;

        // Verify autobiographical property
        for (int i = 0; i < n; i++) {
            int digit = str.charAt(i) - '0';
            if (digit != freq[i]) return 0;
        }

        // Count distinct digits
        int distinct = 0;
        for (int i = 0; i < n; i++) if (freq[i] > 0) distinct++;
        return distinct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(autoCount(sc.next().trim()));
    }
}
