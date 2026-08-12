/*
SOLUTION: ACC-STR-H03 — Move Hyphen to Front (CONFIRMED)
Approach: Two-pass — count hyphens, build result string
Or: collect non-hyphens, prepend counted hyphens
*/
import java.util.*;

public class Q03MoveHyphenToFrontSolution {

    public static String moveHyphen(String str) {
        if (str == null) return null;
        int hyphens = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '-') hyphens++;
            else sb.append(c);
        }
        String prefix = "-".repeat(hyphens);
        return prefix + sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(moveHyphen(sc.nextLine()));
    }
}
