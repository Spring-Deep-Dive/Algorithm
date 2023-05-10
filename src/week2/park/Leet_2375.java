import java.util.*;

public class Leet_2375 {

    private static String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>(); // 9 8 7 6 5 4 3 2 1
        for (int i = 9; i >= 1; i--) {
            stack.push(i);
        }

        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);

            if (c == 'I') {
                sb.append(stack.pop());

                while (temp.size() > 0) {
                    sb.append(temp.pop());
                }

            } else {
                // 0,1 인덱스 다음이며,
                // 이전의 I/D와 다르다면
                if (i - 1 > 0 && pattern.charAt(i - 1) != c) {
                    while (temp.size() > 0) {
                        sb.append(temp.pop());
                    }
                }

                temp.push(stack.pop());
            }
        }

        temp.push(stack.pop());
        while (temp.size() > 0) {
            sb.append(temp.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber("IIDID"));
    }
}
