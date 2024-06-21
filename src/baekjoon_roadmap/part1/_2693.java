package baekjoon_roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2693 {
    // N번째 큰 수
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());  // 테스트 케이스 개수
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<t;i++){
            int[] arr=new int[10];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<10;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[7]+"\n");     //3번째로 큰수
        }
        System.out.print(sb);
    }
}
