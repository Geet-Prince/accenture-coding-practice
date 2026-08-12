/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MATH-H01
Title         : Difference of Sum (Divisibility)
Historical Status : CONFIRMED
Reported Year(s)  : 2020, 2022, 2024, 2026
Role          : ASE / Advanced ASE
Package       : ₹4.5 – ₹9.8 LPA
Topic         : Math — Divisibility
Difficulty    : EASY
Accenture Pattern : HIGH (4-year repeat — highest frequency in math)
Source        : GitHub sbose94 2020, PrepInsta, GFG archives
============================================================
PROBLEM
============================================================
Write a function differenceofSum(n, m) that:

Given two positive integers n and m, compute:
  sum1 = sum of all integers from 1 to m NOT divisible by n
  sum2 = sum of all integers from 1 to m divisible by n

Return (sum1 - sum2)

============================================================
INPUT
============================================================
Line 1: n (divisor)
Line 2: m (upper range limit, inclusive)

============================================================
OUTPUT
============================================================
Single integer: (sum of non-divisible) - (sum of divisible)

============================================================
CONSTRAINTS
============================================================
1 <= n <= 10^4
1 <= m <= 10^4

============================================================
EXAMPLE 1
============================================================
Input:
n=4, m=20

Divisible by 4 in [1..20]: 4, 8, 12, 16, 20 → sum2 = 60
Not divisible in [1..20]:  1,2,3,5,6,7,9,10,11,13,14,15,17,18,19 → sum1 = 150

Output: 90  (150 - 60)

============================================================
EXAMPLE 2
============================================================
Input:
n=3, m=9

Divisible by 3: 3, 6, 9 → sum2 = 18
Not divisible: 1,2,4,5,7,8 → sum1 = 27

Output: 9  (27 - 18)

============================================================
EDGE CASES
============================================================
1. n > m → no number in [1..m] divisible by n → sum2=0, return total sum 1..m
2. n=1 → every number divisible → sum1=0, return negative of total sum
3. Large m → use long for sums

============================================================
EXPECTED APPROACH
============================================================
Simple O(M) loop: for each i from 1 to m, check i%n == 0

Or O(1) formula:
  total = m*(m+1)/2
  k = m/n
  sum2 = n * k*(k+1)/2
  sum1 = total - sum2
  return sum1 - sum2 = total - 2*sum2

============================================================
TIME COMPLEXITY  : O(1) with formula  /  O(M) with loop
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;

public class Q01DifferenceOfSum {

    public static long differenceofSum(int n, int m) {
        // Write your solution here
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println(differenceofSum(n, m));
    }
}
