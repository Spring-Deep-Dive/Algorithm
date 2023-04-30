import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wheelArr = sc.next().split("");
        int m = sc.nextInt();
        String[] targetArr = sc.next().split("");

        int cnt = -1;
        int idx = 0;

        while (cnt++ <= 10000 && idx < targetArr.length) {
            if (targetArr[idx].equals(wheelArr[cnt % wheelArr.length])) {
                idx++;
            }
        }

        System.out.println(cnt <= 10000 ? cnt : -1);
    }
}
