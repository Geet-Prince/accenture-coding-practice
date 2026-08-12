/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-STR-H02
Title         : Operations Binary String (Custom Bitwise Evaluation)
Historical Status : CONFIRMED
Reported Year(s)  : 2020, 2022, 2024
Role          : ASE / Advanced ASE
Package       : ₹4.5 – ₹9.8 LPA
Topic         : Strings — Custom Parsing
Difficulty    : MEDIUM
Accenture Pattern : HIGH (3-year repeat)
Source        : PrepInsta, GFG 2024, GitHub sbose94 2020
============================================================
PROBLEM
============================================================
Given a string str consisting of binary digits ('0', '1')
separated by LETTER OPERATORS:
  'A' → Bitwise AND  (&)
  'B' → Bitwise OR   (|)
  'C' → Bitwise XOR  (^)

Evaluate the expression STRICTLY LEFT TO RIGHT (no operator
precedence — just evaluate each operation as you encounter it).

Return the final binary result as 0 or 1.
Return -1 if the string is null or empty.

============================================================
INPUT
============================================================
A single string (e.g., "1C0C1C1A0B1")

============================================================
OUTPUT
============================================================
0 or 1 (result of left-to-right evaluation)
-1 for null/empty string

============================================================
CONSTRAINTS
============================================================
String length: 1 <= len <= 10^4
Format: digit [operator digit]* (always odd length)
Operators: only A, B, C
Digits: only 0, 1

============================================================
EXAMPLE 1
============================================================
Input: 1C0C1C1A0B1

Step-by-step:
  1 C 0 → 1 XOR 0 = 1
  1 C 1 → 1 XOR 1 = 0
  0 C 1 → 0 XOR 1 = 1
  1 A 0 → 1 AND 0 = 0
  0 B 1 → 0 OR  1 = 1

Output: 1

============================================================
EXAMPLE 2
============================================================
Input: 1A0B1C1

Step-by-step:
  1 A 0 → 1 AND 0 = 0
  0 B 1 → 0 OR  1 = 1
  1 C 1 → 1 XOR 1 = 0

Output: 0

============================================================
EDGE CASES
============================================================
1. null / empty → return -1
2. Single character "1" → return 1
3. Single character "0" → return 0
4. All A operators → AND chain
5. Mixed operators with alternating 0/1

============================================================
EXPECTED APPROACH
============================================================
1. Null/empty check
2. result = str.charAt(0) - '0'  (the first digit)
3. Walk string 2 chars at a time from index 1: operator, then digit
4. Apply operation: update result = result op nextDigit
5. Return result

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;

public class Q02OperationsBinaryString {

    public static int operationsBinaryString(String str) {
        if (str == null || str.isEmpty()) return -1;
        // Write your solution here
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(operationsBinaryString(s));
    }
}
