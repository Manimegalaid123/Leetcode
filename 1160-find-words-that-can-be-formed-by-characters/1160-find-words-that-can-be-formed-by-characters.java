class Solution {
    public int countCharacters(String[] words, String chars) {
         HashMap<Character,Integer> map=new HashMap<>();
     
         for(int i=0;i<chars.length();i++){
            char c=chars.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
         }
         int count=0;
         for(int j=0;j<words.length;j++){
            String word=words[j];
           Boolean isCreate=true;
            HashMap<Character,Integer> map1=new HashMap<>();
            for(int i=0;i<word.length();i++){
                char c=word.charAt(i);
                map1.put(c,map1.getOrDefault(c,0)+1);
              
                if(!map.containsKey(c) ||map.get(c)<map1.get(c)){
                  isCreate=false;
                  break;
                }
            }
                if(isCreate){
                    count+=word.length();
                }
                }
            
         
         return count;
    }
}