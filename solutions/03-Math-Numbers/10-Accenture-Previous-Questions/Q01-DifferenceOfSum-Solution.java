/*
SOLUTION: ACC-MATH-H01 — Difference of Sum (CONFIRMED 4-year)
Two approaches provided:

Approach 1: O(M) loop (simpler, always safe)
Approach 2: O(1) formula (optimal, preferred for ₹9.8 LPA threshold)
*/
import java.util.*;

public class Q01DifferenceOfSumSolution {

    // Approach 1: O(M) loop
    public static long differenceofSumLoop(int n, int m) {
        long sum1 = 0, sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) sum2 += i;
            else sum1 += i;
        }
        return sum1 - sum2;
    }

    // Approach 2: O(1) formula
    public static long differenceofSum(int n, int m) {
        long total = (long) m * (m + 1) / 2;
        long k = m / n;
        long sum2 = n * k * (k + 1) / 2;
        long sum1 = total - sum2;
        return sum1 - sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println(differenceofSum(n, m));
    }
}
