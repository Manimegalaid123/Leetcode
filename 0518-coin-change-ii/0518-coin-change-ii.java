class Solution {
    public int change(int amount, int[] coins) {
       int arr[][]=new int[coins.length+1][amount+1];
       for(int i=0;i<=coins.length;i++){
        arr[i][0]=1;
       }
       for(int i=1;i<=coins.length;i++){
        for(int j=1;j<=amount;j++){
            if(coins[i-1]>j){
                arr[i][j]=arr[i-1][j];
            }else{
                arr[i][j]=arr[i-1][j]+arr[i][j-coins[i-1]];
            }
        }
        
       }
       return arr[coins.length][amount];
    }
}