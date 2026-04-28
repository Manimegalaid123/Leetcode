class Solution {
    public int longestCommonSubsequence(String text11, String text22) {
         int arr[][]=new int[text11.length()+1][text22.length()+1];
            char text1[]=text11.toCharArray();
            char text2[]=text22.toCharArray();
         for(int i=1;i<=text11.length();i++){
            for(int j=1;j<=text22.length();j++){
                if(text1[i-1]!=text2[j-1]){
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
                }else{
                    arr[i][j]=arr[i-1][j-1]+1;
                }
            }
         }
         return arr[text1.length][text2.length];
    }
}