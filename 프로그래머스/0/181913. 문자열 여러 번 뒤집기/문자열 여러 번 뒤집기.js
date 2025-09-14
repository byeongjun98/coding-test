function solution(my_string, queries) {
    let strArray = my_string.split('');

    for (const query of queries) {
        const [s, e] = query;
        
        const partToReverse = strArray.slice(s, e + 1);
        partToReverse.reverse();
        

        strArray.splice(s, partToReverse.length, ...partToReverse);
    }

    return strArray.join('');
}