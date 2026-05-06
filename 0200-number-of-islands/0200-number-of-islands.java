class Solution {
    public void dfs(char a[][],int i,int j){
         if(i<0|| j<0|| i>=a.length|| j>=a[i].length||a[i][j]=='0')
         return ;
         a[i][j]='0';
         dfs(a,i,j+1);
         dfs(a,i,j-1);
         dfs(a,i+1,j);
         dfs(a,i-1,j);
    }
    public int numIslands(char[][] grid) {
        int ans=0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]=='1'){
                ans=ans+1;
                dfs(grid,i,j);
            }
        }
      }  
      return ans;
    }
}