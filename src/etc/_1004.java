package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1004 {
    // 1004 어린왕자
    static int startX;
    static int startY;
    static int endX;
    static int endY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());
            int[] Cx = new int[n];
            int[] Cy = new int[n];
            int[] r = new int[n];

            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                Cx[j] = Integer.parseInt(st.nextToken());
                Cy[j] = Integer.parseInt(st.nextToken());
                r[j] = Integer.parseInt(st.nextToken());
            }
            int result = calculate(Cx, Cy, r, n);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
    public static int calculate(int[] Cx, int[] Cy, int[] r, int n) {
        int count = 0;

        for(int i = 0; i < n; i++) {
            boolean startIN = false, endIN = false;
            if(Math.sqrt(Math.pow(startX - Cx[i], 2) + Math.pow(startY - Cy[i], 2)) < r[i]) startIN = true;
            if(Math.sqrt(Math.pow(endX - Cx[i], 2) + Math.pow(endY - Cy[i], 2)) < r[i]) endIN = true;

            if(startIN ^ endIN) count++;
        }
        return count;
    }
}
