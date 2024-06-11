package step05;

import java.io.*;

public class step05_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";

        while((str = bfr.readLine()) != null) {
            bfw.write(str + "\n");
            // 또는 bfw.write(str); bfw.newLine();
            bfw.flush();
        }
        bfr.close();
        bfw.close();
    }
}
