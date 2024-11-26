function solution(sides) {
  var max = Math.max(...sides);
  var sumOfOthers = sides.reduce((sum, side) => sum + side, 0) - max;

  if (sumOfOthers > max) {
    return 1; 
  } else {
    return 2; 
  }
}