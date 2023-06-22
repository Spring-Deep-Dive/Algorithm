class Solution {

    private static final String BACKSPACE = "#";
    private static final String EMPTY = "";

    public boolean backspaceCompare(String s, String t) {
        s = edit(s);
        t = edit(t);

        return s.equals(t);
    }

    private static String edit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).equals(BACKSPACE)) {
                if (i > 0) {
                    char previous = str.charAt(i - 1);
                    str = str.replaceFirst(previous + BACKSPACE, EMPTY);
                } else {
                    str = str.replaceFirst(BACKSPACE, EMPTY);
                }
                i = 0;
            }
        }
        return str;
    }
}
