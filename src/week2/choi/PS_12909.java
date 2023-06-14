/**
 * create on 2023/05/03.
 * create by IntelliJ IDEA.
 *
 * <p> 코딩테스트 연습 스택/큐
 * 올바른 괄호 </p>
 * <p> {@https://school.programmers.co.kr/learn/courses/30/lessons/12909 } and {@link }관련 클래스 </p>
 *
 * @see
 * @version 1.0
 * @author allen
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class PS_12909 {
    public static boolean solution(String s){
        /*
        stack 보다 int가 빠르지 않을까?
         */
        if (s.length()%2 == 1){
            return false;
        }
        int index =0;
        int stack = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack++;;
            } else if (s.charAt(i) == ')') {
                if (stack > 0){
                    stack--;
                }else{
                    return false;
                }
            }
            index++;
        }
        return stack == 0;
    }
    public static void main(String[] args) {
        String s = "(()())";
        boolean solution = solution(s);
        System.out.println("solution = " + solution);
    }
}