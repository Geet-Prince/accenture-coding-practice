/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-STR-H04
Title         : Replace Character (Simultaneous Swap)
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2026
Topic         : Strings — Replacement
Difficulty    : EASY
Accenture Pattern : HIGH
Source        : PrepInsta, GFG 2022, FacePrep 2026
============================================================
PROBLEM
============================================================
Write a function ReplaceCharacter(str, n, ch1, ch2) that:
  - Replaces ALL occurrences of ch1 with ch2
  - Replaces ALL occurrences of ch2 with ch1
  - SIMULTANEOUSLY (not sequentially)

Return the modified string.
Return null if str is null.

============================================================
EXAMPLE 1
============================================================
Input: str="apples", ch1='a', ch2='p'
Output: "paales"

(all 'a' → 'p', all 'p' → 'a' simultaneously)

============================================================
EXAMPLE 2
============================================================
Input: str="apple", ch1='a', ch2='p'
Output: "paale"

============================================================
EDGE CASES
============================================================
1. null → return null
2. ch1 == ch2 → return original string
3. Neither char appears in string → return original
4. String with only ch1 or only ch2
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(N)
============================================================
*/
import java.util.*;

public class Q04ReplaceCharacter {

    public static String replaceCharacter(String str, char ch1, char ch2) {
        if (str == null) return null;
        // Write your solution here
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        System.out.println(replaceCharacter(s, c1, c2));
    }
}
