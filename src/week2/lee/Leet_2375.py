class Solution(object):
    def smallestNumber(self, pattern):
        i=1
        answer=[]
        temp=[]
        pattern=pattern+"I"

        for p in pattern:
            if p=="I":
                answer.append(i)
                if len(temp) > 0:
                    temp.reverse()
                    answer+=temp
                    temp=[]
            else:
                temp.append(i)
            i+=1

        result = ''
        for i in answer:
            result+=str(i)
        return result
