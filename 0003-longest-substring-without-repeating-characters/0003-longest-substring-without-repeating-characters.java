class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
      int st=0;
      int end=0;
      int max=0;
      while(end<s.length()){
           while(set.contains(s.charAt(end))){
               set.remove(s.charAt(st));
               st++;
           }
           set.add(s.charAt(end));
           int win=end-st+1;
           end++;
           max=Math.max(max,win);
      }
      return max;
    }
}