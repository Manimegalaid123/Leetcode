class Solution {
    public int rearrangeCharacters(String s, String target) {
   
       HashMap<Character,Integer> map1=new HashMap<>();
       HashMap<Character,Integer> map2=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        map1.put(c,map1.getOrDefault(c,0)+1);
       }
       for(int i=0;i<target.length();i++){
        char c=target.charAt(i);
        map2.put(c,map2.getOrDefault(c,0)+1);
       }
       int min=Integer.MAX_VALUE;
       for(char c:map2.keySet()){
        int scount=map1.getOrDefault(c,0);
        int tcount=map2.get(c);
        min=Math.min(min,scount/tcount);
       }
       return min;
    }
}