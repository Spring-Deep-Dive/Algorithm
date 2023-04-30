import java.util.*;

public class Main {

	private static boolean flag;
	private static String[] inputArr;
	private static final List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

		while (true) {
			flag = true;
			input = sc.next();
			if ("*".equals(input)) {
				break;
			}
			inputArr = input.split("");
			if (inputArr.length > 1) {
				validate();
			}
			print(input);
		}
	}

	private static void validate() {
		for (int i = 0; i < inputArr.length - 1 && flag; i++) {
			for (int j = 0, k = j + i + 1; k < inputArr.length && flag; j++, k++) {
				String tmp = inputArr[j] + inputArr[k];
				if (list.contains(tmp)) {
					flag = false;
				}
				list.add(tmp);
			}
			list.clear();
		}
	}

	private static void print(String str) {
		System.out.println(str + " is" + (flag?" ":" NOT ") + "surprising.");
	}
}
