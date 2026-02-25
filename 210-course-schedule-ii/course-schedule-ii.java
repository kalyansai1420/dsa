class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // build graph
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] inDegree  = new int[numCourses];

        for(int[] pre: prerequisites){
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }

        int[] order = new int[numCourses];
        int index = 0;

        //BFS
        while(!q.isEmpty()){
            int curr = q.poll();
            order[index++] = curr;
            for(int next:graph.get(curr)){
                inDegree[next]--;
                if(inDegree[next]==0){
                    q.offer(next);
                }
            }
        }
        if(index!=numCourses) return new int[0];

        return order;

    }
}