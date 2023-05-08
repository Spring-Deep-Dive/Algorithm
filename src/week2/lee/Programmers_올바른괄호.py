def solution(s):
    s = list(s)
    temp = []
    
    #FALSE CASE 1
    #첫번째와 마지막이 ()이 아닌경우 FALSE, 길이가 짝수가 아닌 경우 FALSE
    if s[-1] == '(' or s[0]==')' or (len(s) % 2 == 1):
      return False
                
    
    #FALSE CASE 2
    #)의 개수가 총 길이의 1/2이가 되어야함
    #길이 불충족 시 FALSE
    count=0
    for i in range(len(s)):
        if s[i]==')':
            count+=1
    if count!=(len(s)//2) :
        return False
    
    # 탐색 시작
    # 기준 s(ex. [ (, (, ), )] 마지막 원소 부터 탐색
    # (를 만날때 까지 pop해서 temp에 괄호를 쌓아줌
    # s = [ (, (] temp = [ ), ) ]
    # (를 만나면(s와 temp의 마지막원소 비교) s와 temp 모두 pop해줌
    # 결론적으로 s의 길이가 0이 되면 True 반환
    
    while 1:
        #모든게 pop된 경우는 올바른 괄호
        if len(s) == 0:
            return True
        
        # (를 만날때 까지 pop해서 temp에 괄호를 쌓아줌
        if s[-1]==')':
            temp.append(s.pop());
        
        # (를 만나면(s와 temp의 마지막원소 비교) s와 temp 모두 pop해줌
        # if문 건 이유.
        # temp에 값이 없는 경우 outofindex 에러가나기때문에 ex.())(()
        elif len(temp)>0:
          if temp[-1]==')' and s[-1]=='(':
              temp.pop()
              s.pop()
            
        # (를 만났는데 temp에 )가 없는 경우는 False
        else:
            return False
