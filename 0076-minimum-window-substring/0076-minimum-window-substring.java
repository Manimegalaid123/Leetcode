class Solution {
    public String minWindow(String s, String t) {
         int freq[]=new int[128];
         int minstart=0;
         int minlen=Integer.MAX_VALUE;
         int l=0;
         int r=0;
         int need=t.length();
         if(s.length()<t.length())
         return "";
         for(char c:t.toCharArray()){
            freq[c]++;
         }
         while(r<s.length()){
            if(freq[s.charAt(r)]>0){
                 need--; 
            }
            freq[s.charAt(r)]--;
            r++;
         
         while(need==0){
            if(r-l<minlen){
                minlen=r-l;
                minstart=l;
            }
            int left=s.charAt(l);
            freq[left]++;
            if(freq[left]>0){
                need++;
            }
            l++;
         }
         }
         
         if(minlen==Integer.MAX_VALUE){
            return "";
         }
         return s.substring(minstart,minstart+minlen);
    }
}