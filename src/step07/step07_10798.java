package step07;

import java.io.*;

public class step07_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        char arr[][]=new char[5][15];

        for(int i=0;i<5;i++){
            String str=br.readLine();
            for(int j=0;j<str.length();j++){
                arr[i][j]=str.charAt(j);
            }
        }
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<5;i++){
                if(arr[i][j]==0){
                    continue;
                }
                bw.write(String.valueOf(arr[i][j]));
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
