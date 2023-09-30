class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] arr = new int[2];
        for(int i = 0; i< nums.length;i++){
          int numNeeded = target - nums[i];
          if(map.containsKey(numNeeded)){
            // int j = map.get(numNeeded);
            // arr[0] = Math.min(i,j);
            // arr[1] = Math.max(i,j);
            arr[0] = i;
            arr[1] = map.get(numNeeded);
            return arr;
          }
          map.put(nums[i], i);
        }
        return arr;
    }
}

// We can also use 2 pointer method instead of hashing
//  1. Sort the array
//  2. Take 2 pointer low = 0 and high = n-1
//  if(sum > nums[low] + nums[high]) high-- else low++
//  above method cannot be used if we need to return the index of the elements