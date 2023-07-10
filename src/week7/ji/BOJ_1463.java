import java.util.Scanner;

public class Main {

	private static int[] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n + 1];
		bottomUp();
		System.out.println(d[d.length - 1]);
	}

	private static void bottomUp() {
		d[1] = 0;
		for (int i = 2; i < d.length; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0) {
				d[i] = Math.min(d[i], d[i / 2] + 1);
			}
			if (i % 3 == 0) {
				d[i] = Math.min(d[i], d[i / 3] + 1);
			}
		}
	}
}
