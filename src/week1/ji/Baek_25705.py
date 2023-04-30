n = int(input())
wheelArr = list(input().strip())
m = int(input())
targetArr = list(input().strip())

cnt = 0
idx = 0

while cnt <= 10000 and idx < len(targetArr):
    if targetArr[idx] == wheelArr[cnt % len(wheelArr)]:
        idx += 1
    cnt += 1

print(cnt if cnt <= 10000 else -1)
