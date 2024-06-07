package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step02_2525 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		int C = Integer.parseInt(br.readLine());
		
		int min = 60*A+B;
		min += C;
		
		int hour = (min/60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);

	}

}
