class Solution {
    public int lengthOfLastWord(String s) {
        boolean wordStart = false;
        int count = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == '\s' && wordStart) {
                return count;
            } else if (s.charAt(i) == '\s') {
                continue;
            } else {
                count++;
                wordStart = true;
            }
        }
        return count;
    }
}