class Solution {
    int m;
    int n;
    boolean [][] seen;
    int directions[][]=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        m=grid.length;
        n=grid[0].length;
        seen=new boolean[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !seen[i][j]){
                    seen[i][j]=true;
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;

    }
    void dfs(char[][] grid,int i,int j){
        for(int[] dir:directions){
            int newr=i+dir[0];
            int newc=j+dir[1];
            if(valid(newr,newc,grid) && !seen[newr][newc]){
                seen[newr][newc]=true;
                dfs(grid,newr,newc);
            }
        }
    }
    boolean valid(int i,int j,char[][] grid){
       return 0 <=i && i< m && 0 <= j && j < n && grid[i][j] == '1';
    }
}
