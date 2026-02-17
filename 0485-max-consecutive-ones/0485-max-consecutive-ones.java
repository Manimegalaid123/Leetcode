class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int c=0;
       int Max=0;
       
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            c++;
        }else{
          Max=Math.max(c,Max);
          c=0;
        }
       }
          Max=Math.max(c,Max);
      return Max;
    }
}