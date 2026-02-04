class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>() ;
          HashSet<Integer> set1=new HashSet<>() ;
       int c=0;
       int arr[]=new int[2];
       for(int num:nums2){
    set.add(num);
        
       }
       for(int num:nums1){
        if(set.contains(num)){
            c=c+1;
        }
       }
  int c1=0;
       arr[0]=c;
       for(int num:nums1){
        set1.add(num);
       }
       for(int num:nums2){
  if(set1.contains(num)){
    c1+=1;
  }
       }
       arr[1]=c1;
       return arr;
    }
}