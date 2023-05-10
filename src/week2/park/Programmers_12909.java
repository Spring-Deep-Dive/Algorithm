import java.util.*;

public class Programmers_12909 {
    private static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 == 1) return false;

        for(char c : s.toCharArray()) {
            if(c == ')') {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution(")(((("));  // false
        System.out.println(solution("(())"));   // true
        System.out.println(solution("()()"));   // true
        System.out.println(solution("(())()")); // true
        System.out.println(solution(")()("));   // false
        System.out.println(solution("(()("));   // false
    }
}
