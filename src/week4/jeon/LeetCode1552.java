package AlgorithmBlue.Week4;
/*
Created on 2023/05/18 9:58 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.Arrays;

public class LeetCode1552 {
    public static void main(String[] args) throws Throwable {
        LeetCode1552 code1552 = new LeetCode1552();
        int[] position = { 1, 2, 3, 4, 7 };
        int m = 3;
        System.out.println(code1552.maxDistance(position, m));
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1;
        int right = position[position.length - 1];
        int answer = - 1;
        int middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            // 좌측 기준으로 최대 자력보다 크게 놓을 수 있을 경우
            if (count(position, middle) >= m) {
                // 우측 추가 탐색을 위해 middle + 1
                left = middle + 1;
                answer = Math.max(answer, middle);
            } else {
                right = middle - 1;
            }
        }

        return answer;
    }

    public int count(int[] position, int cnt) {
        int amount = 1;
        int compare = position[0];
        for (int p : position) {
            if (p - compare >= cnt) {
                amount++;
                compare = p;
            }
        }

        return amount;
    }
}