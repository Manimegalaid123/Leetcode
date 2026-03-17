class Solution {
    public int trap(int[] height) {
        int max=-1;
        int sum=0;
       int l[]=new int[height.length];
       int r[]=new int[height.length];
       for(int i=0;i<height.length;i++){
        if(height[i]>=max){
            max=height[i];

        }
        l[i]=max;
       } 
       max=-1;
       for(int i=height.length-1;i>=0;i--){
        if(height[i]>=max){
            max=height[i];
        }
        r[i]=max;
       }
       for(int i=0;i<height.length;i++){
        sum+=Math.min(l[i],r[i])-height[i];
       }
       return sum;
       
    }
}