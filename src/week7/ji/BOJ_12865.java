import java.util.Scanner;

public class Main {

	private static int[] w;
	private static int[] v;
	private static int[] d;
	private static int n;
	private static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		w = new int[n + 1];
		v = new int[n + 1];
		d = new int[k + 1];

		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

//		System.out.println(bottomUp1());
		System.out.println(bottomUp2());
	}

	private static int bottomUp1() {
		int[][] dp = new int[n + 1][k + 1];
		for (int i = 1; i <= n; i++) {
			int weight = w[i - 1];
			int value = v[i - 1];
			for (int j = 1; j <= k; j++) {
				if (weight <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[n][k];
	}

	private static int bottomUp2() {
		for (int i = 1; i <= n; i++) {
			for (int j = k; j - w[i] >= 0; j--) {
				d[j] = Math.max(d[j], d[j - w[i]] + v[i]);
			}
		}

		return d[k];
	}
}
