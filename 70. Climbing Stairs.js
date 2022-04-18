// https://leetcode.com/problems/climbing-stairs/

var climbStairs = function (n) {
    var oneBack = 2;
    var twoBack = 1;

    var curr;

    if (n <= 2) return n;

    for (var i = 3; i <= n; i++) {
        curr = oneBack + twoBack;
        twoBack = oneBack;
        oneBack = curr;
    }

    return curr;
};

console.log(climbStairs(5))