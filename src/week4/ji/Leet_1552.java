import java.util.Arrays;

class Solution {

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 1;
        int end = position[position.length - 1] - position[0];
        int result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isFeasible(position, m, mid)) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    private boolean isFeasible(int[] position, int m, int gap) {
        int count = 1;
        int prev = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - prev >= gap) {
                count++;
                prev = position[i];
            }
        }

        return count >= m;
    }
}
