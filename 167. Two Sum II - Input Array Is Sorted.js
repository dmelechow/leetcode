// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

var twoSum = function (nums, target) {
    var map = new Map();

    for (var i = 0; i < nums.length; i++) {
        if (map.has(target - nums[i])) {
            return [map.get(target - nums[i]) + 1, i + 1]
        }

        map.set(nums[i], i);
    }

    return [];
};


const numbers = [2, 7, 11, 15];
const target = 9;

console.log(twoSum(numbers, target));