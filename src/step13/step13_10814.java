package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step13_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        // 입력 나이 범위 : 1~200
        StringBuilder[] p=new StringBuilder[201];

        // 객체배열의 인덱스에 각 StringBuilder 객체 생성
        for(int i=0; i<p.length; i++){
            p[i]=new StringBuilder();
        }

        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int age=Integer.parseInt(st.nextToken());
            String name=st.nextToken();
            // 카운팅 정렬
            p[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder sb=new StringBuilder();
        for(StringBuilder val : p){
            sb.append(val);
        }
        System.out.println(sb);
    }
}
