function solution(price) {
    var pri = parseInt(price);
    if (pri >= 500000) {
        return Math.floor(pri * 0.80);  
    } else if (pri >= 300000) {
        return Math.floor(pri * 0.9);   
    } else if (pri >= 100000) {
        return Math.floor(pri * 0.95); 
    }
    return pri;  
}



