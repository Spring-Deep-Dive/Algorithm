import java.util.ArrayList;
import java.util.List;

/**
 * create on 2023/05/04.
 * create by IntelliJ IDEA.
 *
 * <p> 2375. Construct Smallest Number From DI String </p>
 * <p> {@https://leetcode.com/problems/construct-smallest-number-from-di-string/ } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class LC_2375 {
    public static void main(String[] args) {


        StringBuilder tmp = new StringBuilder();
//        String pattern = "DDDIII"; // 1234567
//        String pattern = "IIIDIDDD"; // 123456780
        String pattern = "IDIDIDID"; //123456789
        char[] chars = pattern.toCharArray();

        for (int i = 1; i <= chars.length+1; i++) {
            tmp.append(i);
        }
        String numbs = tmp.toString();  // 1234567
        tmp.setLength(0);
        List<Porsion> porsions = makePartList2(chars);

        StringBuilder result = new StringBuilder();
        char prevType = ' ';
        int index = 0;
        for (int i = 0; i < porsions.size() ; i++) {

            char type =porsions.get(i).type;
            int startIdx = porsions.get(i).startIdx;
            int endIdx = porsions.get(i).endIdx;
            System.out.println("type = " + type+ " startIdx = " + startIdx + " endIdx = " + endIdx);

            if ('I' == type) {
                if (startIdx + 1 < endIdx || i == 0){
                    result.append(numbs.substring(startIdx, endIdx));
                }
            }else if ('D' == type){
                tmp.append(numbs.substring(startIdx, endIdx));
                result.append(tmp.reverse());
            }
            tmp.setLength(0);
            System.out.println("indresult.toString() = " + result.toString());
        }
        System.out.println("indresult = " + result.toString());

//        return result.toString();
    }
    public static List<Porsion> makePartList2(char[] chars){
        List<Porsion> porsions = new ArrayList<>();
        StringBuilder tmpSb = new StringBuilder();
        char prevChar = ' ';
        int sIndex = 0;
        int eIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (prevChar == ' '){
                prevChar = chars[i];
                continue;
            }
            prevChar = chars[i-1];
            if (prevChar == chars[i]){
            }else{
                eIndex = i;
                if ('D' == prevChar) eIndex++;
                porsions.add(new Porsion(prevChar, sIndex, eIndex));
                sIndex = eIndex;
            }
        }
        porsions.add(new Porsion(chars[sIndex], sIndex, chars.length+1));
        return porsions;
    }
    static class Porsion{
        char type;
        int startIdx;
        int endIdx;
        public Porsion(char type, int s, int e){
            this.type = type;
            this.startIdx = s;
            this.endIdx = e;
        }

        @Override
        public String toString() {
            return "Porsion{" +
                    "type=" + type +
                    ", startIdx=" + startIdx +
                    ", endIdx=" + endIdx +
                    '}';
        }
    }
}