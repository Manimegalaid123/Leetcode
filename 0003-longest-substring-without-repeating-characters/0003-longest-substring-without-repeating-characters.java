class Solution {
    public int lengthOfLongestSubstring(String s) {
   HashSet<Character> set=new HashSet<>();
   int e=0;
   int st=0;
    int max=0;
    while(e<s.length()){
        char c=s.charAt(e);
        while(set.contains(c)){
            set.remove(s.charAt(st));
            st++;
        }
        set.add(c);
        int win=e-st+1;
        e++;
        max=Math.max(max,win);
        
    }
    return max;
    }
}