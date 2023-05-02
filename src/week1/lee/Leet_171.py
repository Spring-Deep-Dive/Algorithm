class Solution(object):
    def titleToNumber(self, columnTitle):
        res = list(columnTitle)
        length = len(res)
        # ex
        # res = [ 'A',  'B', 'C' ]
        # i는 2, 1, 0 범위로 1씩 줄어듬
        # j는 0, 1, 2 범위로 1씩 커짐
        # 이진법 구하는 방식으로
        # sum = ('A'값(=res[j]) * 26 ** 2(=i)) + ('B'값(=res[j]) * 26 ** 1(=i)) + ('C'값(=res[j]) * 26 ** 0(=i)) 

        j=0
        sum=0
        for i in range(length-1,-1,-1):
            sum += (ord(res[j]) - 64) * (26 **  i)
            j+=1
        return sum
