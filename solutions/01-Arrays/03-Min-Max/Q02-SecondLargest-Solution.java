/*
SOLUTION: ACC-ARR-M02 — Second Largest (Single Pass)
Approach:
  Track largest and second largest in one loop.
  If current > largest: second = largest, largest = current
  If current < largest and current > second: second = current
Time: O(N) | Space: O(1)
*/
import java.util.*;

public class Q02SecondLargestSolution {
    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(secondLargest(arr));
    }
}
