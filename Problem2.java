
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    int result;

    public int countArrangement(int n) {
        result = 0;
        boolean[] visited = new boolean[n + 1];
        helper(1, n, visited);
        return result;
    }

    private void helper(int index, int n, boolean[] visited) {
        // base
        if (index > n) {
            result++;
            return;
        }
        //logic
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % index == 0 || index % i == 0)) {
                //action
                visited[i] = true;       
                //recurse
                helper(index + 1, n, visited); 
                //backtrack
                visited[i] = false;    
            }
        }
    }
}