class Solution {
    public boolean check(int[] nums) {

    int anomalyCount = 0;
    int i = 0;
    int k = 0;
    int n = nums.length;

     while(i<n-1){
         if(nums[i]<=nums[i+1]){
             i++;

         }else{
             k = i+1;
             anomalyCount++;
             break;
         }
         
     }

     if(anomalyCount ==0 ){return true;}
    
     for(int j=0;j<n-1;j++){
         if(nums[(k % n)] > nums[( (k+1) % n )]){
             return false;
         }
         k++;
     }
     return true;

    }
}