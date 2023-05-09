class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder answer = new StringBuilder();
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i <= pattern.length(); i++) {
            stack.append(i + 1);
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                answer.append(stack.reverse());
                stack = new StringBuilder();
            }
        }

        return answer.toString();
    }
}
