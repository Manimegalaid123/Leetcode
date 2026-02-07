class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            arr[k++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[k++]=arr[i];
        }
        return arr;
    }
}