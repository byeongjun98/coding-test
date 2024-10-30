function solution(num_list) {
    let lastEl = num_list[num_list.length - 1];
    let beforeEl = num_list[num_list.length - 2];
    
    if (lastEl > beforeEl) {
        num_list.push(lastEl - beforeEl);
    } else {
        num_list.push(lastEl * 2);
    }
    
    return num_list;
}
