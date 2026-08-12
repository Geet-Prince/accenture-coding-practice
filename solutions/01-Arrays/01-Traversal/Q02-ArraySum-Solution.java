/*
SOLUTION: ACC-ARR-T02 — Array Sum and Average
*/
import java.util.*;
import java.io.*;

public class Q02ArraySumSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0; int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            sum += x;
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", (double) sum / n);
        System.out.println("Positives: " + pos);
        System.out.println("Negatives: " + neg);
        System.out.println("Zeros: " + zero);
    }
}
