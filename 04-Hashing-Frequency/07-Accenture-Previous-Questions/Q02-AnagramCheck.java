/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-HASH-H02
Title         : Anagram Check
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Hashing — Anagram
Difficulty    : EASY-MEDIUM
Accenture Pattern : HIGH
Source        : FacePrep, GFG Accenture archive
============================================================
PROBLEM
============================================================
Given two strings s1 and s2, determine if they are anagrams
of each other. Two strings are anagrams if they contain the
same characters with the same frequencies, regardless of order.

Ignore case (treat uppercase and lowercase as same).
Ignore spaces.

Return "Yes" if anagram, "No" otherwise.

============================================================
EXAMPLE 1
============================================================
Input: s1="Listen", s2="Silent"
Output: Yes

============================================================
EXAMPLE 2
============================================================
Input: s1="hello", s2="world"
Output: No

============================================================
EDGE CASES
============================================================
1. Different lengths → No
2. null inputs → No
3. Spaces (if applicable)
4. Case insensitive: "aA" and "Aa" → Yes
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1) — fixed 26-char alphabet
============================================================
*/
import java.util.*;

public class Q02AnagramCheck {
    public static String isAnagram(String s1, String s2) {
        // Write your solution here
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2));
    }
}
