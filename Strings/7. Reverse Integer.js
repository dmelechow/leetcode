// https://leetcode.com/problems/reverse-integer/

var reverse = function (x) {
    let result = 0;

    while (x !== 0) {
        const pop = x % 10;


        if ((x / 10) | 0) {
            result = (result + pop) * 10;
        } else {
            result = result + pop;
        }

        x = (x / 10) | 0
    }


    if (result > Math.pow(2, 31) - 1 || result < Math.pow(-2, 31)) {
        return 0;
    } else {
        return result;
    }
};

console.log(reverse(1800))
