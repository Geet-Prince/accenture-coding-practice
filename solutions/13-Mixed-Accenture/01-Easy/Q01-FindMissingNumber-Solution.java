/*
SOLUTION: ACC-MIX-E01 — Find Missing Number
*/
import java.util.*;

public class Q01FindMissingNumberSolution {
    public static long findMissing(int[] arr, int n) {
        long expected = (long) n * (n + 1) / 2;
        long actual = 0;
        for (int x : arr) actual += x;
        return expected - actual;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) arr[i] = sc.nextInt();
        System.out.println(findMissing(arr, n));
    }
}
