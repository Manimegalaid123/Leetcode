class Solution {
    public int minDistance(String word1, String word2) {
    int arr[][]=new int [word1.length()+1][word2.length()+1];
    int n= word1.length();
    int m=word2.length();
    for(int i=0;i<=n;i++){
        arr[i][0]=i;
    }       
    for(int i=0;i<=m;i++){
        arr[0][i]=i;
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(word1.charAt(i-1)==word2.charAt(j-1)){
                arr[i][j]=arr[i-1][j-1];
            }else{
                arr[i][j]=1+Math.min(Math.min(arr[i-1][j-1],arr[i-1][j]),arr[i][j-1]);
            }
        }
    }
    return arr[n][m];
    }
}