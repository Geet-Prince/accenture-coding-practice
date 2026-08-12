/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MIX-M02
Title         : Two Sum (Find Pair with Target)
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Arrays + Hashing
Difficulty    : EASY-MEDIUM
Accenture Pattern : MEDIUM
Source        : PrepInsta, GFG
============================================================
PROBLEM
============================================================
Given an integer array and a target integer, return the
0-based indices of the two numbers that add up to target.
Assume exactly one solution exists.

============================================================
EXAMPLE 1
============================================================
Input: nums=[2, 7, 11, 15], target=9
Output: [0, 1] (2 + 7 = 9)
============================================================
TIME COMPLEXITY  : O(N) with HashMap
SPACE COMPLEXITY : O(N)
============================================================
*/
import java.util.*;

public class Q02TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Write your solution here
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int[] res = twoSum(nums, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
