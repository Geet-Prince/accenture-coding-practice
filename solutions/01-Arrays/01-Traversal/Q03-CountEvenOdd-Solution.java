/*
SOLUTION: ACC-ARR-T03 — Count Even and Odd
*/
import java.util.*;
import java.io.*;

public class Q03CountEvenOddSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x % 2 == 0) even++; else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
