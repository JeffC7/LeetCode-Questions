class Solution {
    public boolean isPowerOfTwo(int n) {
        return helper(n, 0);
    }
    
    public boolean helper(int n, int i) {
        // int x = (int)Math.pow(2, i);
        if (Math.pow(2, i) == n) {
            return true;
        }
        if (Math.pow(2, i) > n) {
            return false;
        }
        return helper(n, i + 1);
    }
}