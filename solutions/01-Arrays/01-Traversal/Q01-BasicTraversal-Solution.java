/*
SOLUTION: ACC-ARR-T01 — Basic Array Traversal
Approach : Single pass O(N) — accumulate sum while printing
*/
import java.util.*;
import java.io.*;

public class Q01BasicTraversalSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}
