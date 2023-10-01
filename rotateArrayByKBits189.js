/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
const rotate = function (nums, k) {
  let n = nums.length;
  if (n < 2 || k === 0) return;
  k = k % nums.length;

  reverse(nums, 0, n - k - 1);
  reverse(nums, n - k, n - 1);
  reverse(nums, 0, n - 1);
};

const reverse = function (nums, start, end) {
  while (start <= end) {
    [nums[start], nums[end]] = [nums[end], nums[start]];
    start++;
    end--;
  }
};
