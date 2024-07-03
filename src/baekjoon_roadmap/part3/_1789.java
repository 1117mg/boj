package baekjoon_roadmap.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1789 {
    // 1789 수들의 합
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long S=Long.parseLong(br.readLine());

        // 뺄 값
        int N=1;
        while(true){
            if(S>=N) S -=N;
            // S보다 N이 작으면 반복문 종료
            else break;
            N++;
        }
        // 전치연산
        System.out.println(--N);
    }
}
