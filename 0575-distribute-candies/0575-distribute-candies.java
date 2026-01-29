class Solution {
    public int distributeCandies(int[] candyType) {
         HashSet<Integer> map=new HashSet<>();
         int c=0;
         int n=candyType.length;
         for(int num:candyType){
            if(!map.contains(num)){
                map.add(num);
            }
         }
         if(map.size()>n/2)
         return n/2;
         else if(map.size()<=n/2)
         return map.size();
         return 0;
    }

}