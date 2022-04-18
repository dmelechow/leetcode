// https://leetcode.com/problems/maximum-subarray/


var maxSubArray = function (nums) {
    let localMax = Number.NEGATIVE_INFINITY;
    let globalMax = Number.NEGATIVE_INFINITY;

    for (let i = 0; i < nums.length; i++) {
        localMax = Math.max(nums[i], nums[i] + localMax);

        if (globalMax < localMax) {
            globalMax = localMax;
        }
    }

    return globalMax;
};



// const nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
const nums = [-1];

console.log(maxSubArray(nums))