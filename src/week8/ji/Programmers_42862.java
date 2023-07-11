import java.util.Arrays;

class Solution {

	public int solution(int n, int[] lost, int[] reserve) {
		int c = 0;
		int[] arr = new int[n + 2];
		Arrays.fill(arr, 1);
		for (int e : lost) {
			arr[e]--;
		}
		for (int e : reserve) {
			arr[e]++;
		}
		for (int i = 1; i <= n; i++) {
			if (arr[i] == 0) {
				if (arr[i - 1] >= 2) {
					arr[i - 1]--;
					arr[i]++;
					continue;
				}
				if (arr[i + 1] >= 2) {
					arr[i + 1]--;
					arr[i]++;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			if (arr[i] == 0) {
				c++;
			}
		}

		return n - c;
	}
}
