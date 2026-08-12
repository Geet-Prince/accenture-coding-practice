/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-M02
Title         : Second Largest Element (Single Pass, No Sort)
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Arrays — Min/Max
Difficulty    : EASY-MEDIUM
Accenture Pattern : HIGH
Source        : GFG Accenture archive
============================================================
PROBLEM
============================================================
Given an integer array of size n, find the SECOND LARGEST
distinct element using a SINGLE PASS (O(N)).
Do NOT sort the array.

Return -1 if:
- Array is null
- n < 2
- All elements are the same (no distinct second largest)

============================================================
EXAMPLE 1
============================================================
Input: n=6, arr=[12, 35, 1, 10, 34, 1]
Output: 34

Explanation: Largest = 35, Second largest distinct = 34

============================================================
EXAMPLE 2
============================================================
Input: n=3, arr=[5, 5, 5]
Output: -1

============================================================
EDGE CASES
============================================================
1. Null array → -1
2. n < 2 → -1
3. All same elements → -1
4. Two elements → smaller of them is the answer
5. Duplicates of maximum → skip those
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/
import java.util.*;

public class Q02SecondLargest {
    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;
        // Write your solution here
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(secondLargest(arr));
    }
}
