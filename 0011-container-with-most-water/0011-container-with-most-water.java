class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int max=0;
        int r=h.length-1;
        while(l<r){
                 int min=Math.min(h[r],h[l])*(r-l);
           max=Math.max(max,min);
            if(h[l]>h[r]){
                r--;
            }else{
                l++;
            }
     
        }
 return max;
    }
}