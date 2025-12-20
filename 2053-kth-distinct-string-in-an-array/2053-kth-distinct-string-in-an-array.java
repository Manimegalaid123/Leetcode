class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String st="";
        int c=0;
      for(int i=0;i<arr.length;i++){
        if(map.get(arr[i])==1){
            c=c+1;
            if(c==k){
                st=arr[i];
            }
        }
      }
      return st;
    }
}