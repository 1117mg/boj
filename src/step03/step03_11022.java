package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step03_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());
        int x;
        int y;

        StringTokenizer st;
        for(int i=1;i<=a;i++){
            st=new StringTokenizer(br.readLine(), " ");
            x=Integer.parseInt(st.nextToken());
            y=Integer.parseInt(st.nextToken());
            System.out.println("Case #"+i+": "+x+" + "+y+" = "+(x+y));
        }
        br.close();
    }
}
