import java.util.StringTokenizer;

/**
 * week 1 String
 * Leetcode 58
 * Excel sheet column number
 */
public class Leet_58 {
    public static int solve() {
        String input = "    fly me   to   the moon  ";
        int result = 0;
//        for(String s : input.trim().split("\\s+")) {
//            System.out.println(s);
//        }

        StringTokenizer st = new StringTokenizer(input, " ");

        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
            result = st.nextToken().length();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
    /**
     * https://www.javamex.com/tutorials/regular_expressions/splitting_tokenisation_performance.shtml
     *
     */
}
