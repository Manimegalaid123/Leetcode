class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          Stack<Integer> s=new Stack<Integer>();
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int num:nums2){
            while(!s.isEmpty() && num>s.peek()){
                  map.put(s.pop(),num);
            }
            s.push(num);
          }
          int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}