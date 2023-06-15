package AlgorithmBlue.Week4;
/*
Created on 2023/05/18 1:35 AM In Intelli J IDEA 
by jeon-wangi
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++)
                board[i][j] = line.charAt(j);
        }

        int minCount = M * N + 1;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 첫 번째 칸이 'W'로 시작하는 경우
                int countW = countPaint(board, i, j, 'W');
                // 첫 번째 칸이 'B'로 시작하는 경우
                int countB = countPaint(board, i, j, 'B');

                int min = Math.min(countW, countB);
                minCount = Math.min(minCount, min);
            }
        }

        // 결과 출력
        System.out.println(minCount);
    }

    // 체스판을 칠하는 함수
    public static int countPaint(char[][] board, int startX, int startY, char startColor) {
        int count = 0;

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if (board[i][j] != startColor)
                    count++;
                // 다음 칸은 반대 색깔로 변경
                startColor = (startColor == 'W') ? 'B' : 'W';
            }

            startColor = (startColor == 'W') ? 'B' : 'W';
        }

        return Math.min(count, 64 - count);
    }
}
