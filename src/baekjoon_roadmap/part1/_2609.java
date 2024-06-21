package baekjoon_roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609 {
    // 최대공약수(GCD)와 최소공배수
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        int d=gcd(a,b); //최대공약수

        System.out.println(d);
        System.out.println(a*b/d);
    }

    // 최대공약수 재귀 방식
    public static int gcd(int a, int b){
        while(b!=0){
            int r=a%b;  //나머지를 구해준다

            // GCD(a,b) = GCD(b,r)이므로 변환한다.
            a=b;
            b=r;
        }
        return a;
    }
}
