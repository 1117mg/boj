package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step07_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int max=0; //최댓값
        int row=1; //행
        int col=1; //열

        for(int i=1;i<=9;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1;j<=9;j++){
                int num=Integer.parseInt(st.nextToken());
                if(num>max){
                    max=num;
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+col);
    }
}
