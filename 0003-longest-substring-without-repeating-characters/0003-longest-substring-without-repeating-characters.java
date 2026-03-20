class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0,e=0;
        int max=0;
      
        Set<Character> set=new HashSet<>();
        while(e<s.length()){
               char c=s.charAt(e);
               while(set.contains(c)){
                set.remove(s.charAt(st));
                st++;
               }
               set.add(c);
               int win=e-st+1;
               max=Math.max(win,max);
               e++;
        }
return max;
    }
}