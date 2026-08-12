/*
SOLUTION: ACC-MIX-E02 — String Palindrome
*/
import java.util.*;

public class Q02StringPalindromeSolution {
    public static int isPalindrome(String s) {
        if (s == null) return 0;
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0, r = cleaned.length() - 1;
        while (l < r) {
            if (cleaned.charAt(l) != cleaned.charAt(r)) return 0;
            l++; r--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextLine()));
    }
}
