class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[temp - 1] != nums[i]) {
                nums[temp] = nums[i];
                temp++;
            }
            
        }
        return temp;
    }
}