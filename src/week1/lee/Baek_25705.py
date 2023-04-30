#전체적인 로직
#돌림판이 100번 까지 돌아갔을 경우의 문자열을 만들어 준 후
#해당 문자열에서 비교할 문자들을 하나씩 찾아가면서
#마지막 문자가 있는 index를 구함

#m이 최대 100개까지 입력 가능하므로 최대 돌림판을 돌리는 수는 100번임
#따라서 str의 100을 곱해줌
n = input()
str = list(input()*100)
m = input()
compare = list(input())

j=0
idx = 0

for i in range(len(str)):
  #비교할 문자열을 다찾으면 break
  if j==len(compare):
    break
  #비교할 문자열과 str의 문자열이 같으면 index를 저장해주고 비교할 다음 문자열 할당
  if str[i] == compare[j]:
    j+=1
    idx = i
    
#비교할 문자열을 다 비교하지 못했으면 -1 출력
if j < len(compare):
  print(-1)
#비교할 문자를 다 찾은 경우 인덱스 출력, 인덱스는 0번째부터이므로 1을 더해줌
else:
  print(idx+1)
