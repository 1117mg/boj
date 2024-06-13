package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step08_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int count=1; // 겹 수(최소 루트)
        int range=2; // 범위 (최솟값 기준)

        if(n==1){
            System.out.print(1);
        }
        else{
            while(range<=n){
                range=range+(6*count);
                count++;
            }
            System.out.print(count);
        }
    }
}
