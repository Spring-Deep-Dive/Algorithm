import java.util.Scanner;

public class Main {

    private static final String[][] WBoard = new String[][]{
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"}
    };
    private static final String[][] BBoard = new String[][]{
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"}
    };
    private static String[][] board;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        initialize();
        calc();
        System.out.println(min);
    }

    private static void calc() {
        for (int i = 0; i <= board.length - 8; i++) {
            for (int j = 0; j <= board[i].length - 8; j++) {
                setMin(i, j);
            }
        }
    }

    private static void setMin(int m, int n) {
        int wCnt = 0;
        int bCnt = 0;
        for (int i = m, x = 0; i < m + 8; i++, x++) {
            for (int j = n, y = 0; j < n + 8; j++, y++) {
                if (!board[i][j].equals(WBoard[x][y])) {
                    wCnt++;
                }
                if (!board[i][j].equals(BBoard[x][y])) {
                    bCnt++;
                }
            }
        }
        min = Math.min(min, Math.min(wCnt, bCnt));
    }

    private static void initialize() {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        board = new String[m][n];
        for (int i = 0; i < board.length; i++) {
            board[i] = sc.next().split("");
        }
    }
}
