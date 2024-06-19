package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class step13_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int sum=0;
        int mid=0;
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        Arrays.sort(arr); //오름차순 정렬
        int avg=sum/5;
        mid=arr[2];
        System.out.println(avg+"\n"+mid);

    }
}
