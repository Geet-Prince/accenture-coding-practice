/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MIX-M01
Title         : Number of Carry Operations
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023
Topic         : Math — Digit Manipulation
Difficulty    : MEDIUM
Accenture Pattern : MEDIUM
Source        : PrepInsta, GFG 2022
============================================================
PROBLEM
============================================================
Given two non-negative integers num1 and num2, compute the
total number of CARRY OPERATIONS produced when adding the
two numbers digit-by-digit (column addition) from right to left.

============================================================
EXAMPLE 1
============================================================
Input: num1=451, num2=349
  1 + 9 = 10 → carry 1 (carry count: 1)
  5 + 4 + 1 = 10 → carry 1 (carry count: 2)
  4 + 3 + 1 = 8 → no carry
Output: 2

============================================================
EDGE CASES
============================================================
1. No carries (e.g., 100 + 200)
2. Chain carries (999 + 1 → 3 carries)
3. Different lengths (pad shorter with zeros)
============================================================
TIME COMPLEXITY  : O(max(digits of num1, num2))
SPACE COMPLEXITY : O(1)
============================================================
*/
import java.util.*;

public class Q01NumberOfCarries {
    public static int countCarries(int num1, int num2) {
        // Write your solution here
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countCarries(sc.nextInt(), sc.nextInt()));
    }
}
