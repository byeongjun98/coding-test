function solution(money) {
    var answer = [];
    var jandon = money % 5500
    var coffee = Math.floor(money / 5500)
    answer.push(coffee)
    answer.push(jandon)
    return answer;
}