class Solution {
    public boolean isPalindrome(String ss) {
          int l=0;
          int r=ss.length()-1;
String s=ss.toLowerCase();
          while(l<=r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                l++;
                r--;
            }
          }
          return true;
    }
}