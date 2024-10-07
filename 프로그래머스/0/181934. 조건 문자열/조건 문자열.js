function solution(ineq, eq, n, m) {
    var answer = 0;
    
    if(eq === '='){
        if(ineq === '<'){
            var result = n <= m
            if(result){
                return 1
            } else{
                return 0
            }
            
        } else if(ineq === '>'){
            var result = n >= m
            if(result){
                return 1
            } else{
                return 0
            }

            
        }
    }else if(eq === '!'){
        if(ineq === '<'){
            var result = n < m
            if(result){
                return 1
            } else{
                return 0
            }
            
        } else if(ineq === '>'){
            var result = n > m
            if(result){
                return 1
            } else{
                return 0
            }
            
        }
    }
    
    
}