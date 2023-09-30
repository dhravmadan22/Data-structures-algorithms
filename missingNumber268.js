/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
  const n = nums.length;

  if (n === 0) return;
  if (n === 1) {
    if (nums[0] === 1) return 0;
    else if (nums[0] === 0) return 1;
  }
  let xor1 = 0;
  let xor2 = 0;
  for (let i = 0; i < n; i++) {
    // 0 1 2
    xor1 = xor1 ^ nums[i];
    xor2 = xor2 ^ i;
  }
  xor2 = xor2 ^ n;
  return xor1 ^ xor2;
};

// Mehtod 1 -> check each number in the array 1 by 1
// Method 2 ->Sum of n naturals number - sum of the array
// xor Method 3 -> a ^ a == 0 and a ^ 0 == a
