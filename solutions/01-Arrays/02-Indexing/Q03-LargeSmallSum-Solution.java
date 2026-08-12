/*
SOLUTION: ACC-ARR-I03 — Large Small Sum (CONFIRMED Historical)
Approach:
  - Separate even-indexed and odd-indexed elements
  - Sort both arrays
  - Return sorted_even[size-2] + sorted_odd[1]
Time: O(N log N) | Space: O(N)

CRITICAL EDGE CASES:
  - n <= 3 → return 0
  - Even array must have at least 2 elements for 2nd largest
  - Odd array must have at least 2 elements for 2nd smallest
*/
import java.util.*;
import java.io.*;

public class Q03LargeSmallSumSolution {

    public static int largeSmallSum(int[] arr, int n) {
        if (arr == null || n <= 3) return 0;

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) even.add(arr[i]);
            else odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int secondLargestFromEven = even.get(even.size() - 2);
        int secondSmallestFromOdd = odd.get(1);

        return secondLargestFromEven + secondSmallestFromOdd;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(largeSmallSum(arr, n));
    }
}
