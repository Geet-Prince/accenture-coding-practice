/*
SOLUTION: ACC-ARR-H03 — Superior Elements
Approach: Traverse from right to left, track running max
Elements greater than all to their right → they are the running max
*/
import java.util.*;

public class Q03SuperiorElementsSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxRight) {
                result.add(arr[i]);
                maxRight = arr[i];
            }
        }

        Collections.reverse(result); // restore left-to-right order
        System.out.print("Superior elements: ");
        for (int x : result) System.out.print(x + " ");
        System.out.println("
Count: " + result.size());
    }
}
