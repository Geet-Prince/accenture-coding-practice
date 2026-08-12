/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-T02
Title         : Array Sum and Average
Historical Status : PRACTICE VARIANT
Topic         : Arrays — Traversal
Difficulty    : EASY
============================================================
PROBLEM
============================================================
Given an integer array of size n, compute and print:
1. The sum of all elements
2. The average (as a double, 2 decimal places)
3. Count of positive numbers
4. Count of negative numbers
5. Count of zeros

============================================================
INPUT
============================================================
Line 1: n
Line 2: n integers

============================================================
OUTPUT
============================================================
Sum: <value>
Average: <value with 2 decimals>
Positives: <count>
Negatives: <count>
Zeros: <count>

============================================================
EXAMPLE 1
============================================================
Input:
6
3 -1 0 5 -2 0

Output:
Sum: 5
Average: 0.83
Positives: 2
Negatives: 2
Zeros: 2

============================================================
EDGE CASES
============================================================
1. All zeros
2. Single element
3. All negative

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.io.*;
import java.util.*;

public class Q02ArraySum {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        if (n == 0) return;
        
        long sum = 0;
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
            if (num > 0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        
        double average = (double) sum / n;
        
        System.out.println("Sum: " + sum);
        System.out.printf(Locale.US, "Average: %.2f\n", average);
        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Zeros: " + zeros);
        
        scanner.close();
    }
}
