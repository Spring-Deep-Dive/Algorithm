import java.util.Arrays;

class Solution {
    public int lengthOfLastWord(String s) {
        return Arrays.stream(s.trim().split(" "))
				.reduce((first, second) -> second)
				.get()
				.length();
    }
}
