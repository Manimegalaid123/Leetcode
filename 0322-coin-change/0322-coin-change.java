class Solution {
    public int coinChange(int[] coins, int amount) {
              int arr[][]=new int[coins.length+1][amount+1];
              for(int i=0;i<=amount;i++){
                arr[0][i]=Integer.MAX_VALUE-1;
            
              }  
              for(int i=0;i<=coins.length;i++){
                arr[i][0]=0;
              }   
                     arr[0][0]=0;
              for(int i=1;i<=coins.length;i++){
                for(int j=1;j<=amount;j++){
                    if(coins[i-1]>j){
                        arr[i][j]=arr[i-1][j];
                    }else{
                        arr[i][j]=Math.min((arr[i-1][j]),arr[i][j-coins[i-1]]+1);
                    }
                }
              }
              return arr[coins.length][amount]==Integer.MAX_VALUE-1? -1:arr[coins.length][amount];
    }
}  