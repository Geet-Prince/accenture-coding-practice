/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MATH-H03
Title         : Maximum Exponent of 2 in Range
Historical Status : CONFIRMED
Reported Year(s)  : 2021, 2023, 2025
Topic         : Math — Powers
Difficulty    : MEDIUM
Accenture Pattern : HIGH (3-year repeat)
Source        : PrepInsta, GFG 2021, Unstop 2025
============================================================
PROBLEM
============================================================
Given a closed range [a, b], find the integer in [a, b]
that has the MAXIMUM POWER OF 2 in its prime factorization.

i.e., find x in [a,b] that maximizes the largest k such that
2^k divides x.

If MULTIPLE numbers tie for the maximum exponent, return the
SMALLEST such number.

============================================================
INPUT
============================================================
Line 1: a (lower bound)
Line 2: b (upper bound)

============================================================
OUTPUT
============================================================
Single integer: the number with highest power of 2

============================================================
CONSTRAINTS
============================================================
1 <= a <= b <= 10^6

============================================================
EXAMPLE 1
============================================================
Input: a=7, b=12

Powers of 2:
  7  → 7 is odd → 2^0
  8  → 8 = 2^3  → exponent 3
  9  → odd → 2^0
  10 → 10 = 2 * 5 → exponent 1
  11 → odd → 2^0
  12 → 12 = 4*3 = 2^2 * 3 → exponent 2

Maximum exponent = 3 (at x=8)
Output: 8

============================================================
EXAMPLE 2
============================================================
Input: a=4, b=8

  4 → 2^2, exponent 2
  8 → 2^3, exponent 3

Output: 8

============================================================
EDGE CASES
============================================================
1. a == b → return a
2. All odd numbers in range → return the smallest (exponent 0)
3. Multiple numbers with same max exponent → return smallest

============================================================
EXPECTED APPROACH
============================================================
For each number x in [a,b]:
  count how many times 2 divides x (while x%2==0, count++)
Track max exponent and the smallest number achieving it.

============================================================
TIME COMPLEXITY  : O((b-a) * log(b))
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;

public class Q03MaxExponentOf2 {

    public static int maxExponent(int a, int b) {
        // Write your solution here
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), bVal = sc.nextInt();
        System.out.println(maxExponent(a, bVal));
    }
}
