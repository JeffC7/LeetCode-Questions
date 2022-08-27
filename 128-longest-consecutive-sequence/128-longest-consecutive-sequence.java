class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> hash = new HashSet<>();
        int counter = 1;
        int maxCount = 0;
        int temp;
        int temp2;
        for (int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i] + 1;
            counter = 1;
            while (hash.contains(temp)) {
                hash.remove(temp);
                temp++;
                counter++;
            }
            temp2 = nums[i] - 1;
            while (hash.contains(temp2)) {
                hash.remove(temp2);
                temp2--;
                counter++;
            }
            hash.remove(nums[i]);
            maxCount = Math.max(maxCount, counter);
        }
        return maxCount;
    }
}