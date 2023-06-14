
// hi there this is allen2
public class LC_58 {
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
        int length = words.length;
        System.out.println(words[length-1]);
//        return words[length-1].length();

    }
}