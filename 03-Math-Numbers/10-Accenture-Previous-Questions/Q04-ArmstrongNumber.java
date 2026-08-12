/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MATH-H04
Title         : Armstrong Number Check
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Math — Number Properties
Difficulty    : EASY
Accenture Pattern : HIGH
Source        : FacePrep, GFG, PrepInsta
============================================================
PROBLEM
============================================================
An Armstrong number (Narcissistic number) of k digits is a
number equal to the sum of each of its digits raised to the
power k.

Example: 153 → k=3 → 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 ✓

Write a function to check if a given integer N is an Armstrong
number. Print "Armstrong" or "Not Armstrong".

============================================================
EXAMPLE 1
============================================================
Input: 153
Output: Armstrong

============================================================
EXAMPLE 2
============================================================
Input: 1634
Output: Armstrong (1^4 + 6^4 + 3^4 + 4^4 = 1634)

============================================================
EXAMPLE 3
============================================================
Input: 100
Output: Not Armstrong (1^3 + 0^3 + 0^3 = 1 ≠ 100)

============================================================
EDGE CASES
============================================================
1. Single digit numbers (0–9) are ALL Armstrong numbers
2. Negative numbers → Not Armstrong
============================================================
TIME COMPLEXITY  : O(log N) — number of digits
SPACE COMPLEXITY : O(1)
============================================================
*/
import java.util.*;

public class Q04ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write your solution here
    }
}
