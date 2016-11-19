public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length <= 1)
            return true;
            
        for (int i = 0; i < prerequisites.length; i++) {
            for (int j = 0; j < prerequisites.length; j++) {
                if (prerequisites[i][1] == prerequisites[j][0]) {
                    prerequisites[i][1] = prerequisites[j][1];
                }
                
                if (prerequisites[i][0] == prerequisites[i][1])
                    return false;
            }
        }
        
        return true;
    }
}