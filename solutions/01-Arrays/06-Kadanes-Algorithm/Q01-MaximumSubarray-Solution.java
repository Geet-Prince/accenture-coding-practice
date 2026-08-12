/*
SOLUTION: ACC-ARR-K01 — Maximum Subarray (Kadane's)
Approach: Kadane's Algorithm — O(N) single pass
KEY: Initialize both currentMax and maxSoFar to arr[0], NOT 0
     (handles all-negative arrays correctly)
*/
import java.util.*;
import java.io.*;

public class Q01MaximumSubarraySolution {

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int currentMax = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(maxSubArray(arr));
    }
}
