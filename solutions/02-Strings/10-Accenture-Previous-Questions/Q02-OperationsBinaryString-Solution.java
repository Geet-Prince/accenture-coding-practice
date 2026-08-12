/*
SOLUTION: ACC-STR-H02 — Operations Binary String (CONFIRMED)
KEY: Parse char by char — operator at odd index, digit at even index
Use char arithmetic: '0' or '1' → subtract '0' to get int 0 or 1
*/
import java.util.*;

public class Q02OperationsBinaryStringSolution {

    public static int operationsBinaryString(String str) {
        if (str == null || str.isEmpty()) return -1;

        int result = str.charAt(0) - '0';

        for (int i = 1; i < str.length() - 1; i += 2) {
            char op = str.charAt(i);
            int next = str.charAt(i + 1) - '0';
            if (op == 'A') result = result & next;
            else if (op == 'B') result = result | next;
            else if (op == 'C') result = result ^ next;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(operationsBinaryString(sc.nextLine().trim()));
    }
}
