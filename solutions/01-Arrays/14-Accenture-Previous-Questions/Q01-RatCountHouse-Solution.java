/*
SOLUTION: ACC-ARR-H01 — Rat Count House (CONFIRMED, 4-time repeat)
Approach: Linear scan with prefix accumulation
Key Traps:
  1. Use long for required = (long) r * unit (overflow risk)
  2. Return -1 for null/empty, 0 for insufficient total food
  3. Return i+1 (1-indexed house count, not 0-indexed)
*/
import java.util.*;
import java.io.*;

public class Q01RatCountHouseSolution {

    public static int calculate(int r, int unit, int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        long required = (long) r * unit;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= required) return i + 1;
        }
        return 0; // Not enough food in any house
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine().trim());
        int unit = Integer.parseInt(br.readLine().trim());
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 0) { System.out.println(-1); return; }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(calculate(r, unit, arr));
    }
}
