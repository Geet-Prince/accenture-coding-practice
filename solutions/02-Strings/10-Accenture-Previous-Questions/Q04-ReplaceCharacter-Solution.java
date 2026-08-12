/*
SOLUTION: ACC-STR-H04 — Replace Character (CONFIRMED)
KEY: Must do simultaneous replacement — can't replace ch1→ch2 first
     or replaced ch2s would become ch1 again.
Use a temp char to avoid double-replacement.
*/
import java.util.*;

public class Q04ReplaceCharacterSolution {

    public static String replaceCharacter(String str, char ch1, char ch2) {
        if (str == null) return null;
        if (ch1 == ch2) return str;

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch1) arr[i] = ch2;
            else if (arr[i] == ch2) arr[i] = ch1;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); char c1 = sc.next().charAt(0); char c2 = sc.next().charAt(0);
        System.out.println(replaceCharacter(s, c1, c2));
    }
}
