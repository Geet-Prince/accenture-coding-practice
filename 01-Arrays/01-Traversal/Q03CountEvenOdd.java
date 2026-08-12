/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-T03
Title         : Count Even and Odd Numbers
Historical Status : PRACTICE VARIANT
Topic         : Arrays — Traversal
Difficulty    : EASY
============================================================
PROBLEM
============================================================
Given an integer array of size n, return the count of even
numbers and the count of odd numbers.
Print: "Even: X, Odd: Y"

============================================================
EXAMPLE 1
============================================================
Input: n=5, arr=[1, 2, 3, 4, 5]
Output: Even: 2, Odd: 3

============================================================
EDGE CASES
============================================================
1. All even
2. All odd
3. Negative numbers (e.g., -2 is even)
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/
import java.io.*;
import java.util.*;
public class Q03CountEvenOdd {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even + ", Odd: " + odd);

        sc.close();
    }
}