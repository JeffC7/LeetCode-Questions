class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        int [] arr = new int[nums.length];
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                arr[n--] = leftSquare;
                left++;
            } else {
                arr[n--] = rightSquare;
                right--;
            }
        }
        return arr;
    }
}