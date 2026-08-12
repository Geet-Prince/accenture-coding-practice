/*
SOLUTION: ACC-STR-H01 — Password Checker (CONFIRMED 4-year repeat)

CRITICAL TRAPS:
1. Return -1 for null (NOT 0)
2. Check first char BEFORE the main loop
3. Space AND forward slash must both be checked
4. Use Character.isDigit(), isUpperCase() — don't do ASCII math
*/
import java.util.*;

public class Q01PasswordCheckerSolution {

    public static int checkPassword(String str) {
        if (str == null) return -1;
        if (str.length() < 4) return 0;
        if (Character.isDigit(str.charAt(0))) return 0;

        boolean hasDigit = false, hasUpper = false;

        for (char c : str.toCharArray()) {
            if (c == ' ' || c == '/') return 0; // bad char → fail fast
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUpper = true;
        }
        return (hasDigit && hasUpper) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPassword(s));
    }
}
