function solution(numbers) {
    var sortArray = numbers.sort((a, b) => a - b);
    var arrayLength = numbers.length;
    return sortArray[arrayLength - 1] * sortArray[arrayLength - 2];
}