/*
SOLUTION: ACC-MIX-M01 — Number of Carry Operations (CONFIRMED)
*/
import java.util.*;

public class Q01NumberOfCarriesSolution {
    public static int countCarries(int num1, int num2) {
        int carries = 0, carry = 0;
        while (num1 > 0 || num2 > 0 || carry > 0) {
            int sum = (num1 % 10) + (num2 % 10) + carry;
            carry = sum / 10;
            if (carry > 0) carries++;
            num1 /= 10; num2 /= 10;
        }
        return carries;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countCarries(sc.nextInt(), sc.nextInt()));
    }
}
