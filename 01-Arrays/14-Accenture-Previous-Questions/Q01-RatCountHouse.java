/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-H01
Title         : Rat Count House
Historical Status : CONFIRMED
Reported Year(s)  : 2020, 2022, 2023, 2024
Role          : ASE / Advanced ASE
Package       : ₹4.5 – ₹9.8 LPA
Topic         : Arrays — Greedy Traversal
Difficulty    : EASY
Accenture Pattern : HIGH (repeated 4 times — highest frequency)
Source        : GitHub sbose94 (2020), PrepInsta, GFG, Scribd
============================================================
PROBLEM
============================================================
You are given:
  - r   : number of rats
  - unit: amount of food each rat consumes
  - arr : an integer array of size n, where arr[i] is the
          amount of food available in the i-th house

Calculate the MINIMUM NUMBER OF HOUSES needed (traversed
sequentially from index 0) to feed all r rats.

Total food required = r * unit

Traverse houses from left to right, accumulating food.
Return the count of houses when accumulated food >= required.

============================================================
INPUT
============================================================
Line 1: r (rats)
Line 2: unit (food per rat)
Line 3: n (number of houses)
Line 4: n space-separated integers (food in each house)

============================================================
OUTPUT
============================================================
Minimum number of houses (integer).
Return 0  if total food across ALL houses < required food.
Return -1 if array is null or n <= 0.

============================================================
CONSTRAINTS
============================================================
1 <= r, unit <= 10^4
1 <= n <= 10^4
0 <= arr[i] <= 10^5

============================================================
EXAMPLE 1
============================================================
Input:
7
2
8
2 8 3 5 7 4 1 2

Total required = 7*2 = 14
Accumulated: 2 → 10 → 13 → 18 (>= 14 at house 4)

Output: 4

============================================================
EXAMPLE 2
============================================================
Input:
5
3
4
1 2 3 4

Total required = 15
Total available = 10 < 15

Output: 0

============================================================
EXAMPLE 3
============================================================
Input:
3
2
0
(empty array)

Output: -1

============================================================
EDGE CASES
============================================================
1. n == 0 or array is null → return -1
2. Total food across all houses < required → return 0
3. First house alone satisfies requirement → return 1
4. r or unit is 0 → required = 0, return 0 (0 houses needed — handle this)
5. Very large r*unit causing int overflow → use long

============================================================
EXPECTED APPROACH
============================================================
1. Validate: if null/empty → return -1
2. Compute required = (long) r * unit
3. Traverse array, accumulating sum
4. Return i+1 when sum >= required
5. After loop: return 0 (insufficient food)

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;
import java.io.*;

public class Q01RatCountHouse {

    public static int calculate(int r, int unit, int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        // Write your solution here

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine().trim());
        int unit = Integer.parseInt(br.readLine().trim());
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 0) { System.out.println(-1); return; }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(calculate(r, unit, arr));
    }
}
