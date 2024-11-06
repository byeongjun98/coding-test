function solution(array) {
    var sortArray = array.sort((a,b)=> (a-b));
    var jungang = Math.round((array.length-1) / 2)
    return sortArray[jungang]
}