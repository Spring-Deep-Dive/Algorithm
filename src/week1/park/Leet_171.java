/**
 * week 1 String
 * Leetcode 171
 * Length of last word
 */
public class Leet_171 {
    public static int solve(String columnTitle) {
        int totalDigits = columnTitle.length();
        int result = 0;
        // 'A' = 65, 'Z' = 90
        // think like numeral system base in 26
        // 10 base -> reverse 26 base
        // ABC, A is smallest & C is biggest
        for(int i=0; i<totalDigits; i++) {
            char c = columnTitle.charAt(i);
            result = ((result*26) + (int)c-64);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve("A"));
        System.out.println(solve("AB"));
        System.out.println(solve("ZY"));
    }
}
