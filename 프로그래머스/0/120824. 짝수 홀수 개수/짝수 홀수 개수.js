function solution(num_list) {
    var answer = [];
    var hol = [];
    var zzak = [];
    
    for (var i = 0; i < num_list.length; i++) {  
        if (num_list[i] % 2 === 0) {
            zzak.push(num_list[i]);
        } else if (num_list[i] % 2 === 1) {
            hol.push(num_list[i]);  
        }
    }

    answer.push(zzak.length); 
    answer.push(hol.length);   

    return answer;
}