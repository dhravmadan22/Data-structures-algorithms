/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
  // const n = nums.length;
  // if(n < 2) return;
  // let j;
  // for(j = 0;j<n;j++){
  //     if(nums[j] === 0) break;
  // }

  // for(let i = j+1;i<n; i++){
  //     if(nums[i] != 0){
  //         [nums[i], nums[j]]  = [nums[j], nums[i]];
  //         j++;
  //     }
  // }

  //Snowball Method

  let snowBallSize = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === 0) snowBallSize++;
    else if (snowBallSize > 0) {
      nums[i - snowBallSize] = nums[i];
      nums[i] = 0;
    }
  }
};
