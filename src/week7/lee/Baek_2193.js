let fs = require('fs');
//let input = fs.readFileSync('dev/stdin').toString().split(' ');
///dev/stdin
let input = fs.readFileSync('Baek_2193.txt').toString().split(' ');
let num = Number(input);


let f = new Array(91).fill(BigInt(0));
f[1] = BigInt(1)
f[2] = BigInt(1)


for(let i=3;i<=90;i++){
  f[i] = f[i-1] + f[i-2]
  // console.log(i,f[i]);
}
// console.log(f[1],f[2],f[3]);
console.log(f[num].toString());

//00 : 10 
//000 : 100 101 110(X) 111(x) 
//0000 : 
