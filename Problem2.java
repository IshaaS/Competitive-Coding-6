
// Time Complexity : O(n!)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//used backtracking to find all possible permutaions but pruned(constraint‑based) it to stop
//whenever invalid permuatation is detected early.
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