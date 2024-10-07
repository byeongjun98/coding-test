function solution(a, b) {
    var etc1 = String(a) + String(b)
    var etc2 = 2 * a * b
    if(Number(etc1) > etc2){
        return Number(etc1)
    } else if(etc1 < etc2){
        return etc2
    } else if(Number(etc1)===etc2){
        return Number(etc1)
    }
    // var answer = 0;
    // return answer;
}