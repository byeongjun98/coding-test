function solution(n) {
    var result = 0;
    for (var i = 0; i <= n; i++) {
        if (i % 2 === 0) {  
            result += i;  
        }
    }
    return result;
}
