class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String ss=s.toLowerCase();
        while(i<=j){
                if(!Character.isLetterOrDigit(ss.charAt(i))){
                    i++;
                }else if(!Character.isLetterOrDigit(ss.charAt(j))){
                    j--;
                }else
                 if(ss.charAt(i)!=ss.charAt(j)){
                    return false;
                }else{
                       i++;
                       j--;
                }
        }
        return true;
    }
}