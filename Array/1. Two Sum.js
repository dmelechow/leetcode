// https://leetcode.com/problems/two-sum/

const nums = [0, 1, 0, 3, 12];
const target = 4;

function twoSum(nums, target) {
    var map = new Map();

    for (var i = 0; i < nums.length; i++) {
        if (map.has(target - nums[i])) {
            return [i, map.get(target - nums[i])];
        }
        map.set(nums[i], i);
    }

    return [];
}

console.log(twoSum(nums, target))
