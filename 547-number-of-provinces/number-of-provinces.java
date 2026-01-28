class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(isConnected,i,visited);
            }
        }
        return count;
    }

    public void dfs(int[][] isConnected, int curr, boolean[] visited){
        visited[curr] = true;
        for(int i=0;i<isConnected[curr].length;i++){
            if(isConnected[curr][i] == 1 && !visited[i]){
                dfs(isConnected,i,visited);
            }
        }
    }
}