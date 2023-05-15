function solution(operations) {

	var oper = []
	var val = []
	var answer = []
    
    //["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]
    //oper = ["I", "I", "D", "D", "D", "I", "D"]
    //val = ["16, "-5643", "-1" ,"1", "1", "123", "-1"]
    //위 처럼 나눠 담음
	for(var i=0;i<operations.length;i++){
		arr=operations[i].split(" ");
		oper.push(arr[0]);
		val.push(arr[1]);
	}

	for(var i=0;i<oper.length;i++){
		if(oper[i]=='D'){
			if(answer.length==0){
				continue; //D이고 길이가 0인경우는 다음 연산자 탐색
			}
			else if(val[i]==1){
				answer.pop(); //D이고 1이면 가장 위에꺼 pop
			 }
			else if(val[i]== -1){
				answer.shift(); //D이고 -1이면 가장 아래꺼 제거
			}
		}
		if(oper[i]=='I'){
			answer.push(val[i]); //I이면 해당 값 push
			answer.sort((a,b)=>a-b); // 오름차순으로 정렬
		}
		
	}
	
	if(answer.length==0){ //다 삭제되었으면 0,0 return
		return [0,0];
	}
	else if(answer.length==1){ //길이가 1개면 최대 최소가 같으므로 같은 값 return
		a = answer.pop();
		return [a,a];
	}
	else{
		return [parseInt(answer.pop()),parseInt(answer.shift())]; //최대, 최소 리턴
	}

}
