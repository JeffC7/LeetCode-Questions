class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 1) {
            return strs[0];
        }
        
        if (strs[0].equals("")) {
            return "";
        }
        
        String smallest = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            if (smallest.length() > strs[i].length()) {
                smallest = strs[i];
            }
        }
        //After this point, I should have the smallest string in the  array in smallest
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < smallest.length(); j++) {
                if (j == 0 && smallest.charAt(j) != strs[i].charAt(j)) {
                    return "";
                }
                if (smallest.charAt(j) != strs[i].charAt(j)) {
                    smallest = smallest.substring(0, j);
                    break;
                }
            }
        }
        return smallest;
    }
}
