/**
 * @param {number} n
 * @return {number[][]}
 */
var generateMatrix = function(n) {
    var arr= new Array(n);
    for(var i=0;i<arr.length;i++){
        arr[i] = new Array(n);
    }
    val = 1;
    start=0;
    end = n;
	while(1){
		//시작 행
		 //커지는 값

		 if(start>Math.round(n/2)-1){
		 	return arr;
		 }
         

         if(start==Math.round(n/2)-1){
            if(n%2==1){
		 	arr[start][start]=val;
            return arr;
            }
            else{
                arr[start][start]=val++;
                arr[start][start+1]=val++;
                arr[start+1][start+1]=val++;
                arr[start+1][start]=val++;
                return arr;
            }
		 }

		//첫 행
		for(var i=start;i<end;i++){
		arr[start][i]=val++;
		}
		
		//마지막 열
		for(var i=start+1;i<end;i++){
		arr[i][end-1]=val++;
		}
		
		//마지막 행
		for(var i=end-2;i>=start;i--){
		arr[end-1][i]=val++;
		}
		
		//첫 열
		for(var i=end-2;i>=start+1;i--){
		arr[i][start]=val++;
		}
		
		start++;
        end--;
	}
};
