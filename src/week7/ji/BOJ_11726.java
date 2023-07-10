import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n + 1));
	}

	private static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		long[] dp = new long[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}

		return dp[n];
	}
}
