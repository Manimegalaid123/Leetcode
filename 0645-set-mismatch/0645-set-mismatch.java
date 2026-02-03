class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
           int sum=0;
           int sum1=0;
      for(int i=1;i<=nums.length;i++)
     sum+=i;
     ArrayList<Integer> list=new ArrayList<>();
      for(int num:nums){
        if(!set.contains(num)){
        set.add(num);
        }else{
            list.add(num);
        }
      }
      for(int num:set){
        sum1=sum1+num;
      }
      list.add(sum-sum1);
    int arr[]=new int[list.size()];
    for(int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
    }
    return arr;
    }
}