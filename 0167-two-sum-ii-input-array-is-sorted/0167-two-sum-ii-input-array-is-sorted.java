class Solution {
    public int[] twoSum(int[] nums, int target) {



int i=0;
int j=nums.length-1;
while(i<j){
    int c=nums[i]+nums[j];
    if(c==target){
    return new int[]{i+1,j+1};
    }
    else if(c>target){
     j--;
    }
    else{
    i++;
    }
} return null;
}




}



