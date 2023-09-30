class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length
    if(n < 2 || k === 0) return;
    k = k%nums.length;

    reverse(nums,0,n-k-1);
    reverse(nums, n-k,n-1);
    reverse(nums,0,n-1);
    }
}