class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int windowStart = 0, maxLength = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            if (map.containsKey(s.charAt(windowEnd))) {
                windowStart = Math.max(windowStart, map.get(s.charAt(windowEnd)) + 1);
            }
            map.put(s.charAt(windowEnd), windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}