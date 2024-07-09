package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1019 {
    // 1019 책 페이지
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 1;
        int b = Integer.parseInt(br.readLine());
        int[] counts = new int[10];
        int digit = 1;

        while(a <= b) {
            if (b % 10 != 9) {
                calc(b, counts,digit);
                b--;
            }
            if (b < a) {
                break;
            }
            if (a % 10 != 0) {
                calc(a, counts, digit);
                a++;
            }
            if (a % 10 == 0 && b % 10 == 9) {
                for (int i = 0; i < 10; i++) {
                    counts[i] += (b / 10 - a / 10 + 1) * digit;
                }
                digit *= 10;
                a /= 10;
                b /= 10;
            }
        }
        Arrays.stream(counts).forEach(i->System.out.print(i + " "));
    }

    public static void calc(int n, int[] counts, int digit) {
        while (n > 0) {
            counts[n % 10] += digit;
            n /= 10;
        }
    }
}
