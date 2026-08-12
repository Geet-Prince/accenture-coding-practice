/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-STR-V01
Title         : Password Validator
Historical Status : PRACTICE VARIANT (based on CONFIRMED pattern)
Topic         : Strings — Validation
Difficulty    : EASY-MEDIUM
Accenture Pattern : HIGH
============================================================
PROBLEM
============================================================
Design a password validation function for a login system.
A password is VALID if ALL of the following are true:
  1. Length >= 6 characters
  2. Contains at least one digit (0–9)
  3. Contains at least one uppercase letter (A–Z)
  4. Contains at least one lowercase letter (a–z)
  5. Contains at least one special character from: @, #, $, !
  6. Does NOT contain any spaces

Return true if valid, false otherwise.

============================================================
EXAMPLE 1
============================================================
Input: "SecureP@ss1"
Output: true

============================================================
EXAMPLE 2
============================================================
Input: "weak"
Output: false (too short, no digit, no special char)

============================================================
EDGE CASES
============================================================
1. Empty string → false
2. Only spaces → false
3. Exactly 6 chars meeting all conditions → true
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/
import java.util.*;

public class Q01PasswordValidator {
    public static boolean isValid(String password) {
        // Write your solution here
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s) ? "true" : "false");
    }
}
