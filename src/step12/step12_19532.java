package step12;

import java.io.*;
import java.util.StringTokenizer;

public class step12_19532 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine());
        br.close();

        // 첫번째 식
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 두번째 식
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        // 가감법
        bw.write((c*e - b*f) / (a*e - b*d) + " "); // x축
        bw.write((c*d - a*f) / (b*d - a*e) + ""); // y축
        bw.flush();
        bw.close();
    }
}
