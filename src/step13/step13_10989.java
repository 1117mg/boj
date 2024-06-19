package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step13_10989 {
    public static void main(String[] args) throws IOException {
        // 수의 범위 (0~10000) 사실상 0은 제외
        int[] cnt=new int[10001];

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            //해당 인덱스 값을 1씩 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }
        br.close();

        StringBuilder sb=new StringBuilder();

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i=1; i<10001; i++){
            // i값의 개수가 0이 될때까지 출력 (빈도수)
            while(cnt[i]>0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
