function solution(a, b) {
    var etc1 = String(a) +String(b)
    var etc2 = String(b) +String(a)
    if(etc1 > etc2) {
        return Number(etc1);
    } else if(etc1 < etc2){
        return Number(etc2);
    } else{
        return Number(etc1);
    }
    // var answer = 0;
    // return answer;
}