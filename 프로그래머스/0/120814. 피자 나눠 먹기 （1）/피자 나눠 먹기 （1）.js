function solution(n) {
    var result = 0
    var pizza = 7
    var pan = Math.ceil(n / pizza)
    if(pan !== 0){
        result = pan;
    } else {
        result =  1;
    }
    return result
}