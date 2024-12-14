function solution(box, n) {
    var x = Math.floor(box[0] / n); 
    var y = Math.floor(box[1] / n); 
    var z = Math.floor(box[2] / n);


    var answer = x * y * z;
    
    return answer; 
}