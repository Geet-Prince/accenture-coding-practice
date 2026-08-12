/*
SOLUTION: ACC-MATH-H04 — Armstrong Number (CONFIRMED)
*/
import java.util.*;

public class Q04ArmstrongNumberSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) { System.out.println("Not Armstrong"); return; }
        String s = String.valueOf(n);
        int k = s.length();
        long sum = 0;
        for (char c : s.toCharArray()) {
            int d = c - '0';
            long power = 1;
            for (int i = 0; i < k; i++) power *= d;
            sum += power;
        }
        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
    }
}
