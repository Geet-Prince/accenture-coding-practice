/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-HASH-H01
Title         : Autobiographical Number Check
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Hashing — String Frequency
Difficulty    : MEDIUM
Accenture Pattern : HIGH (3-year repeat)
Source        : PrepInsta, GFG, LeetCode Discuss 2024
============================================================
PROBLEM
============================================================
A number is AUTOBIOGRAPHICAL if the digit at index i (0-based)
equals the count of times digit i appears in the number.

Write a function AutoCount(str) that:
  - Returns the COUNT OF DISTINCT DIGITS if the number is autobiographical
  - Returns 0 if the number is NOT autobiographical

============================================================
INPUT
============================================================
A number represented as a String

============================================================
OUTPUT
============================================================
Count of distinct digits (if autobiographical), else 0

============================================================
EXAMPLE 1
============================================================
Input: "1210"
  Index 0 → digit '1' → count of '0' in "1210" = 1 ✓
  Index 1 → digit '2' → count of '1' in "1210" = 2 ✓
  Index 2 → digit '1' → count of '2' in "1210" = 1 ✓
  Index 3 → digit '0' → count of '3' in "1210" = 0 ✓

  All match! Distinct digits used: {0, 1, 2} → 3

Output: 3

============================================================
EXAMPLE 2
============================================================
Input: "2020"
  Index 0 → digit '2' → count of '0' in "2020" = 2 ✓
  Index 1 → digit '0' → count of '1' in "2020" = 0 ✓
  Index 2 → digit '2' → count of '2' in "2020" = 2 ✓
  Index 3 → digit '0' → count of '3' in "2020" = 0 ✓

Output: 2  (distinct: {0, 2})

============================================================
EDGE CASES
============================================================
1. null or empty → return 0
2. Single digit "0" → "0" means zero 0s → contradiction → return 0
3. Single digit "1" → "1" means one 1, but there's only one 1 ✓ → return 1? 
   Actually it means count of digit 0 = 1, but digit 0 appears 0 times → fail
   Actually "1" → index 0 has '1' → count of digit '0' = 1, but '0' appears 0 times → FAIL → return 0
   (Single digit numbers are almost never autobiographical except special cases)

============================================================
TIME COMPLEXITY  : O(N^2) simple  /  O(N) with frequency array
SPACE COMPLEXITY : O(N) or O(10)
============================================================
*/

import java.util.*;

public class Q01AutobiographicalNumber {

    public static int autoCount(String str) {
        if (str == null || str.isEmpty()) return 0;
        // Write your solution here
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(autoCount(sc.next().trim()));
    }
}
