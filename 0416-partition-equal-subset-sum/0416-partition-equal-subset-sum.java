class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean arr[][]=new boolean[nums.length+1][target+1];
        for(int i=0;i<=nums.length;i++){
            arr[i][0]=true;
        }
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=target;j++){
                if(nums[i-1]>j){
                    arr[i][j]=arr[i-1][j];
                }else{
                    arr[i][j]=arr[i-1][j] || arr[i-1][j-nums[i-1]];
                }
            }
        }  return arr[nums.length][target];
           }


}