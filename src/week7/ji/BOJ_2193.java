import java.util.Scanner;

public class Main {

	private static long[] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new long[n + 1];
//		System.out.println(bottomUp());
		System.out.println(topDown(n));
	}

	private static long bottomUp() {
		d[0] = 0;
		d[1] = 1;
		for (int i = 2; i < d.length; i++) {
			d[i] = d[i-1] + d[i-2];
		}

		return d[d.length - 1];
	}

	private static long topDown(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (d[n] > 0) {
			return d[n];
		}
		d[n] = topDown(n - 1) + topDown(n - 2);

		return d[n];
	}
}
