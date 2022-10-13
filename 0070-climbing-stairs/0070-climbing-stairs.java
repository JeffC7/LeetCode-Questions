class Solution {
    public int climbStairs(int n) {
        /* 
        1 step = 1 way
        2 steps = 2 ways
        3 steps = 3 ways
        4 steps = 5 ways
        */
        int prev1 = 1;
        int prev2 = 2;
        if (n==1) return prev1;
        for (int i = 3; i <= n; i++) {
            int val = prev2 + prev1;
            prev1 = prev2;
            prev2 = val;
        }
        return prev2;
    }
}