class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        int sum=0;
       ArrayList<String> list=new ArrayList<>(); 
          HashMap<String,Integer> map=new HashMap<>();
          for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
          }
          for(int i=0;i<list2.length;i++){
            String res=list2[i];
            if(map.containsKey(list2[i])){
                sum=i+map.get(list2[i]);
                   if(min>sum){
                    list.clear();
                    min=sum;
                   list.add(res);
                   }else if(sum==min){
                    list.add(res);
                   }
            }
          }
      return list.toArray(new String[0]);       
    }
}