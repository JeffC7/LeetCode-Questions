class Solution {
    public int[] plusOne(int[] digits) {
        int counter = 0; 
        for (int i = digits.length - 1; i >= 0;  i--) {
            if (digits[i] == 9) {
                counter++;
            } else {
                break;
            }
        }
            // by now, i have the number of 9's
            // check the base case
        if (counter == digits.length) {
            int[] new_arr = new int[digits.length + 1];
            new_arr[0] = 1;
            for (int i = 1; i < digits.length - 1; i++) {
                new_arr[i] = 0;
            }
            return new_arr;
        } else {
            digits[digits.length - counter - 1] = digits[digits.length - counter - 1] + 1;
            for(int i = digits.length - counter; i < digits.length; i++) {
                digits[i] = 0;
            }
            return digits;
        }
    }
}