import java.util.Scanner;

public class Main {

	private static int n;
	private static int cnt;
	private static boolean[][] board;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cnt = 0;
		board = new boolean[n][n];
		backtracking(0);
		System.out.println(cnt);
	}

	private static void backtracking(int col) {
		if (col == n) {
			cnt++;
			return;
		}

		for (int row = 0; row < n; row++) {
			if (isSafe(row, col)) {
				board[row][col] = true;
				backtracking(col + 1);
				board[row][col] = false;
			}
		}
	}

	private static boolean isSafe(int row, int col) {
		for (int i = 0; i < col; i++) {
			if (board[row][i]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		for (int i = row, j = col; i < n && j >= 0; i++, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		return true;
	}
}
