package baekjoon_roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2460 {
    // 지능형 기차 2
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // 최대값
        int max=0;
        // 현재 인원 수
        int sum=0;

        for(int i=0;i<10;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N= Integer.parseInt(st.nextToken());
            int M= Integer.parseInt(st.nextToken());
            sum=sum-N+M;
            // 현재 인원수가 최대값이면 저장
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
