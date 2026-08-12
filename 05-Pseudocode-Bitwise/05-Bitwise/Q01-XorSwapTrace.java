/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-PSEUDO-B01
Title         : XOR Swap — Output Prediction
Historical Status : CONFIRMED (Pseudocode MCQ pattern)
Reported Year(s)  : 2021, 2022, 2023, 2024
Topic         : Pseudocode — Bitwise XOR
Difficulty    : EASY-MEDIUM
Accenture Pattern : HIGH
============================================================
PROBLEM
============================================================
This question type appears in Accenture's Stage 1 Pseudocode MCQ section.
You are given code and must predict the output WITHOUT running it.

--- TRACE THIS CODE ---

int a = 5, b = 3;
a = a ^ b;
b = b ^ a;
a = a ^ b;
System.out.println("a=" + a + " b=" + b);

What is the output?

This Java file implements it so you can verify your mental trace.
FIRST: predict the output on paper. THEN run to confirm.

============================================================
BITWISE OPERATORS REFERENCE
============================================================
XOR (^): 1^1=0, 1^0=1, 0^1=1, 0^0=0
AND (&): 1&1=1, 1&0=0, 0&1=0, 0&0=0
OR  (|): 1|1=1, 1|0=1, 0|1=1, 0|0=0

5 in binary: 101
3 in binary: 011

Step 1: a = 5^3 = ?
Step 2: b = 3^(new_a) = ?
Step 3: a = (new_a)^(new_b) = ?

============================================================
YOUR PREDICTED OUTPUT:
(write here before running)

============================================================
*/
public class Q01XorSwapTrace {
    public static void main(String[] args) {
        int a = 5, b = 3;
        // Trace these lines manually first:
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a=" + a + " b=" + b);
        // Expected: a=3 b=5 (values are swapped!)
    }
}
