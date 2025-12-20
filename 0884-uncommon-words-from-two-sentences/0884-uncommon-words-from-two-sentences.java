class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
     String []a1=s1.split(" ");
     String []a2=s2.split(" ");
    HashMap<String,Integer> map=new HashMap<>();
    ArrayList<String> list=new ArrayList<>();

    for(String word:a1){
        map.put(word,map.getOrDefault(word,0)+1);
    }
    for(String word:a2){
     map.put(word,map.getOrDefault(word,0)+1);
        
    }
   
    for(String key:map.keySet()){
        if(map.get(key)==1){
            list.add(key);
        }
    }
    String []res=new String[list.size()];
    int i=0;
     for(String s:list){
         res[i++]=s;
     }
     return res;
    }
}