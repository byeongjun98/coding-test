function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    var bunja = denom1 * numer2 + denom2 * numer1
    var bunmo = denom1 * denom2
    
    function gcd(bunja, bunmo) {
    const remainder = bunja % bunmo;  
    
    if (remainder === 0){
        return bunmo
        }  
    else {
        return gcd(bunmo, remainder)
        }; 
    }   
    return  [bunja/gcd(bunja,bunmo), bunmo/gcd(bunja,bunmo)]
}
