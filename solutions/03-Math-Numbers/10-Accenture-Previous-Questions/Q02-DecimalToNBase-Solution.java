/*
SOLUTION: ACC-MATH-H02 — Decimal to N-Base (CONFIRMED)
KEY: ASCII trap — mapping remainder to correct char
*/
import java.util.*;

public class Q02DecimalToNBaseSolution {

    public static String dectoNBase(int n, int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % n;
            char c = (rem >= 10) ? (char)('A' + rem - 10) : (char)('0' + rem);
            sb.insert(0, c);
            num /= n;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num = sc.nextInt();
        System.out.println(dectoNBase(n, num));
    }
}
