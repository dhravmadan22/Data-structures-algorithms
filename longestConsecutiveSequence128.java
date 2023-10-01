class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> numsSet = new HashSet<>(n);
        for(int i =0 ;i<n;i++){
            numsSet.add(nums[i]);
        }
        int longest = 0;
        for( int num : numsSet){
            if(!numsSet.contains(num-1)){
                int cnt = 1;
                int x = num;

                while(numsSet.contains(x+1)){
                    x+=1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}

// solve in O(n) time