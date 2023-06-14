
public class LC_171 {
    public static void main(String[] args) {
        int base26 = 26;
        int modiValue = 64;
//        char ch = 'A';
//        int hashCode = Character.hashCode(ch);
//        System.out.println('A' - modiValue);
//        ch = 'C';
//        hashCode = Character.hashCode(ch);
//        System.out.println('C' - modiValue);
//        ch = 'Z';
//        hashCode = Character.hashCode(ch);
//        System.out.println('Z' - modiValue);
//        // z = 26
//        // zy = 25(y) + 2*26 = 26^1 * 26 + 26^0 * 25
//        // - 64
        String input = "AB";
        char[] chars = input.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            int exponent = chars.length - i - 1;
            int charCode = Character.hashCode(chars[i]) - modiValue;
            int tmp = (int) Math.pow(base26, exponent);
            result += tmp * charCode;
        }
        System.out.println("result = " + result);

    }
}
}
