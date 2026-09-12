class Solution {

    private void dfs(ArrayList<Integer>[] graph, int i, boolean[] visited ){
        visited[i] = true;

        for(int j=0; j<graph[i].size(); j++){
            if(!visited[graph[i].get(j)]){
                dfs(graph, graph[i].get(j), visited);
            }
            
        }
    }

    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<Integer> [] graph = new ArrayList[n];
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(isConnected[i][j] == 1){
                    graph[i].add(j);
                    graph[j].add(i);
                }
            }
        }
        int count = 0;

        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(graph, i, visited);
                count++;
            }
        }

        return count;
    }
    
}