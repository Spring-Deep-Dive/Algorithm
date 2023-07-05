let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split(' ');
///dev/stdin
//let input = fs.readFileSync('dev/stdin/input.txt').toString().split(' ');
let num = Number(input);
let result = new Array(num+1).fill(0);


for (let i = 2; i <= num; i++) {
   if(i<=3){
     result[i]=1;
   }
   else{
    result[i] = result[i-1] + 1 ; // - 연산 한번만 더한 경우
    if(i%3==0){
       result[i]=Math.min(result[i],result[i/3]+1); // 3 나누기 연산 한번만 더한 경우
    }

    if(i%2==0){
        result[i]=Math.min(result[i],result[i/2]+1); // 2 나누기 연산 한번만 더한 경우
    }
    
  }
  //console.log(result[i]);
 }

console.log(result[num]);
