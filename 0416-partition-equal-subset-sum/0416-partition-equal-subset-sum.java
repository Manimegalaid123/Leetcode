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
       int t=sum/2;
       boolean a[]=new boolean[t+1];
       a[0]=true;
       for(int num:nums){
        for(int j=t;j>=num;j--){
        a[j]=a[j]||a[j-num];
        }
       }return a[t];
        
           }


}