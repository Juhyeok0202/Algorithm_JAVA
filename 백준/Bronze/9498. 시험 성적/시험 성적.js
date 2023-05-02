const fs = require('fs');
const inputData = fs.readFileSync('/dev/stdin');
const a = inputData

if(a>=90 && a<=100){
    console.log('A');
}else if(a>=80){
    console.log('B');
}else if(a>=70){
    console.log('C');
}else if(a>=60){
    console.log('D');
}else{
    console.log('F');
}