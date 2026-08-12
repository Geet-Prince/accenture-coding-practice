/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-PSEUDO-H01
Title         : Bitwise Operations Output Trace (MCQ Type)
Historical Status : CONFIRMED (Stage 1 MCQ pattern)
Reported Year(s)  : 2021–2024 (every year in Stage 1 Pseudocode section)
Topic         : Pseudocode — Bitwise
Difficulty    : MEDIUM
Accenture Pattern : HIGH
============================================================
PROBLEM
============================================================
This represents the TYPE of pseudocode question in Accenture Stage 1.
For each code block, predict the output MENTALLY first.

--- BLOCK 1: AND ---
int a = 12, b = 10;
System.out.println(a & b);
// 12 = 1100, 10 = 1010, AND = 1000 = 8

--- BLOCK 2: OR ---
int a = 12, b = 10;
System.out.println(a | b);
// 12 = 1100, 10 = 1010, OR = 1110 = 14

--- BLOCK 3: XOR ---
int a = 12, b = 10;
System.out.println(a ^ b);
// 12 = 1100, 10 = 1010, XOR = 0110 = 6

--- BLOCK 4: Left Shift ---
int a = 3;
System.out.println(a << 2);
// 3 = 011, shift left 2 = 01100 = 12  (same as 3 * 4)

--- BLOCK 5: Right Shift ---
int a = 12;
System.out.println(a >> 2);
// 12 = 1100, shift right 2 = 0011 = 3  (same as 12 / 4)

Predict all outputs before running!
============================================================
*/
public class Q01BitwiseOperationsTrace {
    public static void main(String[] args) {
        int a, b;

        System.out.println("=== AND ===");
        a = 12; b = 10;
        System.out.println(a & b);   // Expected: 8

        System.out.println("=== OR ===");
        a = 12; b = 10;
        System.out.println(a | b);   // Expected: 14

        System.out.println("=== XOR ===");
        a = 12; b = 10;
        System.out.println(a ^ b);   // Expected: 6

        System.out.println("=== LEFT SHIFT ===");
        a = 3;
        System.out.println(a << 2);  // Expected: 12

        System.out.println("=== RIGHT SHIFT ===");
        a = 12;
        System.out.println(a >> 2);  // Expected: 3
    }
}
