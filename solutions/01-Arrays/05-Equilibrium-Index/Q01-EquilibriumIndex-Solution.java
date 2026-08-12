/*
SOLUTION: ACC-ARR-E01 — Equilibrium Index
Approach: Prefix sum in one pass
  - Compute totalSum
  - Walk array: leftSum grows, rightSum = totalSum - leftSum - arr[i]
  - Return index when leftSum == rightSum

CRITICAL: Use long to avoid integer overflow for large arrays!
*/
import java.util.*;
import java.io.*;

public class Q01EquilibriumIndexSolution {

    public static int findEquilibriumIndex(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        long totalSum = 0;
        for (int x : arr) totalSum += x;

        long leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            long rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(findEquilibriumIndex(arr));
    }
}
