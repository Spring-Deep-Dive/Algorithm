import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final String SPACE = " ";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] s = new String[n];
		s[0] = "  *  ";
		s[1] = " * * ";
		s[2] = "*****";

		int size = 3;
		while (size != n) {
			makeStar(size, s);
			size *= 2;
		}

		Arrays.stream(s).forEach(System.out::println);
	}

	private static void makeStar(int size, String[] s) {
		for (int i = size; i < 2 * size; i++) {
			s[i] = s[i - size] + SPACE + s[i - size];
		}
		for (int i = 0; i < size; i++) {
			s[i] = SPACE.repeat(size) + s[i] + SPACE.repeat(size);
		}
	}
}
