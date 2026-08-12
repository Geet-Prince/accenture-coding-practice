/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-STR-H01
Title         : Password Checker
Historical Status : CONFIRMED
Reported Year(s)  : 2021, 2022, 2023, 2024
Role          : ASE / Advanced ASE
Package       : ₹4.5 – ₹9.8 LPA
Topic         : Strings — Validation
Difficulty    : MEDIUM
Accenture Pattern : HIGH (4-year repeat)
Source        : GFG 2021 interview, PrepInsta, GitHub atharva7803
============================================================
PROBLEM
============================================================
Write a function CheckPassword(str, n) to validate a password.

A password is VALID if ALL conditions are met:
  1. Minimum length of 4 characters
  2. Contains at least 1 numeric digit (0–9)
  3. Contains at least 1 uppercase letter (A–Z)
  4. Does NOT contain any space (' ')
  5. Does NOT contain a forward slash ('/')
  6. The FIRST CHARACTER is NOT a digit

Return 1 if valid, 0 if invalid.
Return -1 if the string is null.

============================================================
INPUT
============================================================
A single string (the password to check)

============================================================
OUTPUT
============================================================
1   → valid
0   → invalid
-1  → null input

============================================================
CONSTRAINTS
============================================================
0 <= n <= 1000

============================================================
EXAMPLE 1
============================================================
Input: aA1_67
Output: 1

Explanation:
- Length 6 >= 4 ✓
- Has digit '1' ✓
- Has uppercase 'A' ✓
- No space or '/' ✓
- First char 'a' is not a digit ✓

============================================================
EXAMPLE 2
============================================================
Input: a987 abC012
Output: 0

Explanation: Contains a space → INVALID

============================================================
EXAMPLE 3
============================================================
Input: 1Password
Output: 0

Explanation: First character '1' is a digit → INVALID

============================================================
EXAMPLE 4
============================================================
Input: abc
Output: 0

Explanation: Length 3 < 4 → INVALID

============================================================
EDGE CASES
============================================================
1. null string → return -1
2. Empty string → return 0 (length < 4)
3. Exactly 4 chars meeting all conditions → return 1
4. Password starts with '0' → return 0
5. Password contains '/' → return 0
6. Password has uppercase but no digit → return 0

============================================================
EXPECTED APPROACH
============================================================
1. null check → return -1
2. Length check → if < 4 return 0
3. First char check → if digit return 0
4. Single pass: track hasDigit, hasUpper, hasBadChar flags
5. If hasBadChar (space or /) → return 0
6. Return 1 if hasDigit && hasUpper, else 0

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;

public class Q01PasswordChecker {

    public static int checkPassword(String str) {
        if (str == null) return -1;
        // Write your solution here
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPassword(s));
    }
}
