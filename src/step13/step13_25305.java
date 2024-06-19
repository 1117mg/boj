package step13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step13_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());  // 첫번째 줄 입력받음

        int N= Integer.parseInt(st.nextToken());    //응시자 수
        int k= Integer.parseInt(st.nextToken());    //수상자 수

        int[] score=new int[N];

        st=new StringTokenizer(br.readLine());  // 두번째 쭐 입력받음

        for(int i=0; i<N; i++){ // 점수 5개 입력받음
            score[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(score);     // 오름차순 정렬

        bw.write(score[N-k]+"");    // 점수[응시자수 - 수상자수] = 커트라인
        bw.flush();
        bw.close();
    }
}
