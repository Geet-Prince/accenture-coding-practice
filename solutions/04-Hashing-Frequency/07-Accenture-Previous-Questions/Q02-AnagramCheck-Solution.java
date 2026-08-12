/*
SOLUTION: ACC-HASH-H02 — Anagram Check (CONFIRMED)
*/
import java.util.*;

public class Q02AnagramCheckSolution {
    public static String isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return "No";
        int[] freq = new int[26];
        for (char c : s1.toLowerCase().toCharArray()) if (c != ' ') freq[c - 'a']++;
        for (char c : s2.toLowerCase().toCharArray()) if (c != ' ') freq[c - 'a']--;
        for (int f : freq) if (f != 0) return "No";
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isAnagram(sc.nextLine(), sc.nextLine()));
    }
}
