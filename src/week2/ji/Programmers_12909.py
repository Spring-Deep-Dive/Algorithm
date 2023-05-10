def solution(s):
    cnt = 0
    for i in range(len(s)):
        if cnt < 0:
            break
        if s[i] == '(':
            cnt += 1
        else:
            cnt -= 1
    return cnt == 0
