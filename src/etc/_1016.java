package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1016 {
    // 1016 제곱 ㄴㄴ수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long s = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());

        long count = e-s+1;
        boolean[] check = new boolean[(int)count];

        for(long i=2; i*i<=e; i++) {
            long pow = i*i; // 제곱수
            long tmp = s/pow;
            if(s%pow != 0) { // 제곱수 아니면 +1
                tmp += 1;
            }

            for(long j = tmp; j*pow<=e; j++) {
                int canSqrt = (int)(j*pow-s);
                if(!check[canSqrt]) {
                    check[canSqrt] = true;
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
