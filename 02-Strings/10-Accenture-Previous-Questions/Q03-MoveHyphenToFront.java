/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-STR-H03
Title         : Move Hyphen to Front
Historical Status : CONFIRMED
Reported Year(s)  : 2021, 2022, 2024
Topic         : Strings — Character Manipulation
Difficulty    : EASY
Accenture Pattern : HIGH (3-year repeat)
Source        : PrepInsta, GFG 2022, GitHub atharva7803
============================================================
PROBLEM
============================================================
Write a function MoveHyphen(str, n) that moves ALL hyphens
('-') present in the string to the BEGINNING of the string,
while preserving the original RELATIVE ORDER of all non-hyphen
characters.

============================================================
INPUT
============================================================
A single string

============================================================
OUTPUT
============================================================
Modified string with all hyphens at the front.
Return null if input is null.

============================================================
EXAMPLE 1
============================================================
Input: "Move-Hyphens-to-Front"
Output: "--MoveHyphenstoFront"
(2 hyphens moved to front, other chars in original order)

============================================================
EXAMPLE 2
============================================================
Input: "---abc"
Output: "---abc"
(already at front, no change)

============================================================
EDGE CASES
============================================================
1. null → return null
2. Empty string → return ""
3. No hyphens → return original string
4. All hyphens → return same string
5. Hyphen at start and middle

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(N)
============================================================
*/

import java.util.*;

public class Q03MoveHyphenToFront {

    public static String moveHyphen(String str) {
        if (str == null) return null;
        // Write your solution here
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(moveHyphen(sc.nextLine()));
    }
}
