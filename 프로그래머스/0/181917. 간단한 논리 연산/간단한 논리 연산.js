function solution(x1, x2, x3, x4) {
    var first = x1 || x2
    var second = x3 || x4
    var result = first && second
    return result;
}