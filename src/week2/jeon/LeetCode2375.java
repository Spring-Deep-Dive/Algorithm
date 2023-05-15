public class LeetCode2375 {
    private static String smallestNumber(String pattern) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int index = 1;
        for (int i = 0; i < pattern.length(); i++) {
            temp.append(index++);
            if (pattern.charAt(i) == 'I') {
                res.append(temp.reverse());
                temp.setLength(0);
            }
        }
        temp.append(index++);
        res.append(temp.reverse());
        return res.toString();
    }
}