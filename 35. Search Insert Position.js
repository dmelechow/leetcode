// https://leetcode.com/problems/search-insert-position/


const nums = [1, 3, 5, 6];

const target = 2;

var searchInsert = function (nums, target) {
    let lowIndex = 0;
    let highIndex = nums.length - 1;

    let midIndex;

    while (lowIndex <= highIndex) {
        midIndex = Math.floor((highIndex + lowIndex) / 2);

        if (nums[midIndex] === target) return midIndex;

        if (nums[midIndex] > target) highIndex = midIndex - 1;

        if (nums[midIndex] < target) lowIndex = midIndex + 1;
    }

    return lowIndex;
};

console.log(searchInsert(nums, target))
