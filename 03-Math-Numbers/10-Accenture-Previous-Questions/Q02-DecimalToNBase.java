/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MATH-H02
Title         : Decimal to N-Base Conversion
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023
Topic         : Math — Base Conversion
Difficulty    : MEDIUM
Accenture Pattern : HIGH
Source        : PrepInsta Aug 2022, GitHub sayandipsar
============================================================
PROBLEM
============================================================
Write a function DectoNBase(n, num) that converts a positive
decimal integer num to its representation in base n (2 <= n <= 36).

Use digits 0–9 for values 0–9.
Use uppercase letters A–Z for values 10–35 (A=10, B=11, ..., Z=35).

Return the base-n representation as a String.

============================================================
INPUT
============================================================
Line 1: n (target base, 2 <= n <= 36)
Line 2: num (positive decimal integer)

============================================================
OUTPUT
============================================================
String representation of num in base n

============================================================
CONSTRAINTS
============================================================
2 <= n <= 36
1 <= num <= 10^9

============================================================
EXAMPLE 1
============================================================
Input: n=12, num=718

718 / 12 = 59 remainder 10 → 'A'
59  / 12 =  4 remainder 11 → 'B'
4   / 12 =  0 remainder  4 → '4'

Reversed: "4BA"
Output: 4BA

============================================================
EXAMPLE 2
============================================================
Input: n=2, num=10
Output: 1010 (binary)

============================================================
EXAMPLE 3
============================================================
Input: n=16, num=255
Output: FF (hexadecimal)

============================================================
EDGE CASES
============================================================
1. num=0 → return "0"
2. n=10 → same as decimal
3. Large num → remainders stay within [0, n-1] ≤ 35

============================================================
EXPECTED APPROACH
============================================================
1. Handle num==0 → return "0"
2. While num > 0: compute rem = num % n
   - If rem >= 10: map to char 'A' + (rem - 10)
   - Else: map to char '0' + rem
   Prepend/insert at front
   num /= n
3. Return built string

============================================================
KEY ASCII TRAP
============================================================
  rem < 10 → (char)('0' + rem)
  rem >= 10 → (char)('A' + rem - 10)

============================================================
TIME COMPLEXITY  : O(log_n(num))
SPACE COMPLEXITY : O(log_n(num))
============================================================
*/

import java.util.*;

public class Q02DecimalToNBase {

    public static String dectoNBase(int n, int num) {
        if (num == 0) return "0";
        // Write your solution here
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num = sc.nextInt();
        System.out.println(dectoNBase(n, num));
    }
}
