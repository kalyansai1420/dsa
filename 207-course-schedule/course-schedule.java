class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // build graph
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course);
        }
        int[] state = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(state[i]==0){
                if(!dfs(i,graph,state)) return false;
            }
        }
        return true;
    }

    private boolean dfs(int node,List<List<Integer>> graph, int[] state){
        if(state[node]==1) return false;
        if(state[node]==2) return true;
        state[node] = 1;
        for(int next:graph.get(node)){
            if(!dfs(next,graph,state)) return false;
        }
        state[node] = 2;
        return true;
    }
}