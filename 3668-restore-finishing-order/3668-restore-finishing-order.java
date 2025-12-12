class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:friends){
           set.add(num); 
        }
       ArrayList<Integer> list=new ArrayList<>();
    for(int j=0;j<order.length;j++){
        if(set.contains(order[j])){
           list.add(order[j]);
        }
    }
        int res[]=new int[list.size()];
        int i=0;
        for(int num:list){
            res[i++]=num;
        }
     return res;
    }
}