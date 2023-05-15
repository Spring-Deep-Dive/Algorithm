public class Programmers12909 {
    private static boolean solution(String s) {
        if (s.length() % 2 != 0)
            return false;
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(')
            return false;

        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                index++;
                continue;
            }

            if (index == 0)
                return false;
            index--;
        }

        return index == 0;
    }
}