package baekjoon_roadmap.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3085 {
    // 3085 사탕 게임
    // 브루트 포스
    public static char[][] board;
    public static int num;
    public static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        board = new char[num][num];

        String line = "";
        for(int i = 0; i < num; i++) {
            line = br.readLine();
            board[i] = line.toCharArray();
        }

        // 행
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num-1; j++) {
                char swap = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = swap;
                // max값 찾으러
                search();
                // 원상 복구
                swap = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = swap;
            }
        }

        // 열
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num-1; j++) {
                char swap = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = swap;
                // max값 찾으러
                max = Math.max(search(), max);
                // 원상 복구
                swap = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = swap;
            }
        }


        System.out.println(max);

    }

    private static int search() {
        // 가로
        for(int i = 0; i < num; i++) {
            int cnt = 1;
            for(int j = 0; j < num-1; j++) {
                if(board[i][j] == board[i][j+1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }

        // 세로
        for(int i = 0; i < num; i++) {
            int cnt = 1;
            for(int j = 0; j < num-1; j++) {
                if(board[j][i] == board[j+1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }

        return max;
    }
}
