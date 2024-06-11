package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step04_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int arr[]=new int[31];
        for(int i=1;i<=28;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int j=1;j<=30;j++){
            if(arr[j]==0){
                System.out.println(j);
            }
        }
        br.close();
    }
}
