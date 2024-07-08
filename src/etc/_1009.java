package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1009 {
    // 1009 분산처리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a % 10 == 0) {
                sb.append(10 + "\n");
                continue;
            }
            int num = a % 10;
            for (int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }
            sb.append(num + "\n");
        }
        System.out.print(sb);
    }
}
