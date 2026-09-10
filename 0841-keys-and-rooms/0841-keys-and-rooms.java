class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean  vis[] = new boolean[n];
        dfs(rooms, 0, vis);
        for(int i=0; i<n; i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;

    }
    private void dfs(List<List<Integer>> rooms, int source, boolean[] vis){
        vis[source] = true;

        for(int node : rooms.get(source)){
            if(!vis[node]){
                dfs(rooms, node, vis);
            }
        }

    }
}