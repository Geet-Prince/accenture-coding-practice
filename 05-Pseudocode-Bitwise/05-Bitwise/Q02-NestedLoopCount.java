/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-PSEUDO-B02
Title         : Nested Loop Output Prediction
Historical Status : CONFIRMED (Pseudocode MCQ pattern)
Reported Year(s)  : 2021, 2022, 2023, 2024
Topic         : Pseudocode — Nested Loops
Difficulty    : MEDIUM
Accenture Pattern : HIGH
============================================================
PROBLEM
============================================================
FIRST predict all outputs on paper. THEN verify by running.

--- TRACE CODE 1 ---
int count = 0;
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        count++;
    }
}
System.out.println(count);

Your predicted output: ?
(Answer: 10 = 1+2+3+4)

--- TRACE CODE 2 ---
int x = 5;
System.out.println(x++);
System.out.println(++x);
System.out.println(x);

Your predicted output: ? ? ?
(Key: x++ prints BEFORE increment, ++x increments BEFORE printing)

--- TRACE CODE 3 ---
for (int i = 0; i < 3; i++) {
    for (int j = i; j < 3; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

Your predicted output:
============================================================
*/
public class Q02NestedLoopCount {
    public static void main(String[] args) {
        System.out.println("=== Code 1 ===");
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) { count++; }
        }
        System.out.println(count);

        System.out.println("=== Code 2 ===");
        int x = 5;
        System.out.println(x++);  // prints 5, then x becomes 6
        System.out.println(++x);  // x becomes 7, then prints 7
        System.out.println(x);    // prints 7

        System.out.println("=== Code 3 ===");
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) { System.out.print("* "); }
            System.out.println();
        }
    }
}
