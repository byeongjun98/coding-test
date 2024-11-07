function solution(n) {
    var answer = 0;
    
    var strNum = n.toString();  
    var len = strNum.length;
    
    for (var i = 0; i < len; i++) {
        var subStr = parseInt(strNum.substr(i, 1));  
        answer += subStr; 
    }
    
    return answer;
}
