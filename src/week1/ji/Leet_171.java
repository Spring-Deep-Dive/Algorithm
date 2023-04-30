class Solution {
	public int titleToNumber(String columnTitle) {
		int res = 0;
		for (int i = 0, j = columnTitle.length() - 1; i < columnTitle.length(); i++, j--) {
			res += (columnTitle.charAt(i) - 64) * (int) Math.pow(26, j);
		}

		return res;
	}
}
