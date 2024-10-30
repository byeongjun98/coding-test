function solution(num_list) {
    var odd = "";
    var even = "";
    
    for (let i = 0; i < num_list.length; i++) {
        if (num_list[i] % 2 === 1) {
            odd += num_list[i];
        } else if (num_list[i] % 2 === 0) {
            even += num_list[i];
        }
    }
    
    return parseInt(odd) + parseInt(even);
}
