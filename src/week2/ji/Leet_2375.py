class Solution:
    def smallestNumber(self, pattern: str) -> str:
        answer = ""
        stack = []
        for i in range(len(pattern)+1):
            stack.append(str(i+1))
            if i == len(pattern) or pattern[i] == 'I':
                answer += "".join(stack[::-1])
                stack = []
        return answer
