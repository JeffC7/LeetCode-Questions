class Solution {
    public void moveZeroes(int[] nums) {
        int end = nums.length;
        int i = 0;
        int counter = 1;
        int temp1, temp2;
        while (counter != end) {
            temp1 = nums[i];
            temp2 = nums[counter];
            if (temp1 == 0 && temp2 != 0) {
                nums[i] = temp2;
                nums[counter] = temp1;
                if ((i + 1) != counter) {
                    i++;
                } else {
                    i++;
                    counter++;
                }
            } else if (temp1 == 0 && temp2 == 0) {
                counter++;
            } else {
                i++;
                counter++;
            }
        }
    }
}