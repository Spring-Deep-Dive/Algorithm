class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        res = 0
        for i in range(len(columnTitle)):
            j = len(columnTitle) - i - 1
            res += (ord(columnTitle[i]) - 64) * (26 ** j)
        
        return res
