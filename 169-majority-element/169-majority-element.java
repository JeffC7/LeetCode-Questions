class Solution {
    public int majorityElement(int[] nums) {
        // have a counter to keep track of the number of times an element appears
        int counter = 0;
        
        // have a variable to keep track of the majority
        int maj = 0;
        
        // loop through the entire array.
        // if counter = 0, the element at current index is the new maj
        // if we see the maj element again, then increment counter by 1
        // if not, decrement counter by 1;
        for (int i = 0; i < nums.length; i++) {
            if (counter == 0) {
                maj = nums[i];
                counter++;
            } else if (maj == nums[i]) {
                counter++;
            } else {
                counter--;
            }
        }
        return maj;
    }
}