class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer> map=new HashMap<>();
     HashSet<Integer> set=new HashSet<>();
     for(int num:arr){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }else{
            map.put(num,1);
        }
     }
     for( int num:map.values()){
        if(set.contains(num)){
         return false;
        }
        set.add(num);
     }
     return true;
    }
}