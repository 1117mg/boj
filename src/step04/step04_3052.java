package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class step04_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h=new HashSet<Integer>();

        for(int i=0;i<10;i++){
            h.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.print(h.size());
    }
}
