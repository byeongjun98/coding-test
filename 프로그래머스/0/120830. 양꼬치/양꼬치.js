function solution(n, k) {
    var yang = 12000 * n
    var service = Math.floor(n / 10)
    var eum = 0
    if(service >= 1){
        eum =  (2000 * k) - (2000 * service)
        return yang + eum
    } else if(service < 1){
        eum = 2000 * k
        return yang + eum
    }

}