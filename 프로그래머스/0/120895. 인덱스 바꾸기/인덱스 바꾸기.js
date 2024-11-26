function solution(my_string, num1, num2) {
    var char1 = my_string[num1];
    var char2 = my_string[num2];

    var myArray = my_string.split('');

    myArray[num1] = char2;
    myArray[num2] = char1;

    var answer = myArray.join('');
    
    return answer;
}