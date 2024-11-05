function solution(numbers) {
    var count = numbers.length
    var total = 0
    for(var i = 0; i < numbers.length; i++){
        total = total + numbers[i]
    }
    return total / count
}