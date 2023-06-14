import java.util.Arrays;

public class BJ_2448 {
    public static void main(String[] args) {
        int n = 24; // 출력할 패턴의 높이 (24를 기준으로 예시 작성)
        char[][] pattern = new char[n][2 * n - 1]; // 패턴을 저장할 2차원 배열 생성
        for (char[] row : pattern) {
            Arrays.fill(row, ' '); // 패턴 배열을 공백 문자로 초기화
        }

        drawPattern(pattern, 0, n - 1, n); // 패턴 그리기 함수 호출

        // 패턴 출력
        for (char[] row : pattern) {
            System.out.println(row);
        }
    }

    // 패턴 그리기 함수
    private static void drawPattern(char[][] pattern, int row, int col, int height) {
//        for (char[] tmp : pattern) {
//            System.out.println(tmp);
//        }
//        System.out.println(" ---------------------------------------------------- ");
        if (height == 3) {
            pattern[row][col] = '*';
            pattern[row + 1][col - 1] = '*';
            pattern[row + 1][col + 1] = '*';
            pattern[row + 2][col - 2] = '*';
            pattern[row + 2][col - 1] = '*';
            pattern[row + 2][col] = '*';
            pattern[row + 2][col + 1] = '*';
            pattern[row + 2][col + 2] = '*';

        } else {
            int newHeight = height / 2; //12 --> 6 --> 3
            drawPattern(pattern, row, col, newHeight); // 상단 삼각형 그리기
            drawPattern(pattern, row + newHeight, col - newHeight, newHeight); // 왼쪽 하단 삼각형 그리기
            drawPattern(pattern, row + newHeight, col + newHeight, newHeight); // 오른쪽 하단 삼각형 그리기
        }
    }
}
