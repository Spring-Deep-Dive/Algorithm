package week6.choi;

public class LC_844 {
    public boolean solution(String s, String t) {
//        char[] charsS = s.toCharArray();
//        char[] charsT = t.toCharArray();

        s = goFilter(s.toCharArray());
        t = goFilter(t.toCharArray());
        System.out.println( "s = " + s + ", t = "+t);
        return s.equals(t);
    }
    private String goFilter(char[] chars){
        StringBuilder sb = new StringBuilder();
        for (char c: chars) {
            if (c == '#'){
                if (sb.length() <= 0)
                    continue;
                sb.deleteCharAt(sb.length()-1);
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        LC_844 lc_844 = new LC_844();
//        System.out.println(lc_844.solution("ab#c", "ad#c"));
//        System.out.println(lc_844.solution("ab##", "c#d#"));
//        System.out.println(lc_844.solution("a##c", "#a#c"));
        System.out.println(lc_844.solution("a#c", "b"));

    }
}