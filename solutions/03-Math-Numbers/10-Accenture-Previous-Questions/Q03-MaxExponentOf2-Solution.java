/*
SOLUTION: ACC-MATH-H03 — Max Exponent of 2 (CONFIRMED 3-year)
*/
import java.util.*;

public class Q03MaxExponentOf2Solution {

    public static int maxExponent(int a, int b) {
        int bestNum = a, bestExp = 0;
        for (int x = a; x <= b; x++) {
            int exp = 0, temp = x;
            while (temp % 2 == 0) { exp++; temp /= 2; }
            if (exp > bestExp) { bestExp = exp; bestNum = x; }
            // if tie: we already track smallest since we iterate a→b
        }
        return bestNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(maxExponent(sc.nextInt(), sc.nextInt()));
    }
}
