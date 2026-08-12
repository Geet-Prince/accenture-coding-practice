/*
SOLUTION: ACC-ARR-H02 — Product Smallest Pair (CONFIRMED)
Approach: Sort and take first two, OR linear O(N) scan for two minimums
Using linear approach for O(N):
*/
import java.util.*;
import java.io.*;

public class Q02ProductSmallestPairSolution {

    public static long productSmallestPair(int targetSum, int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < min1) { min2 = min1; min1 = x; }
            else if (x < min2) { min2 = x; }
        }
        if ((long) min1 + min2 <= targetSum) return (long) min1 * min2;
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine().trim());
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(productSmallestPair(sum, arr));
    }
}
