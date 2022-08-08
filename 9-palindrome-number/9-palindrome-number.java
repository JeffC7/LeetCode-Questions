class Solution {
    public boolean isPalindrome(int x) {
        // base case
        if (x < 0) {
            return false;
        }
        
        int[] array = getDigits(x);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - (i + 1)]) {
                return false;
            } 
        }
        
        return true;

    }
    
    public int getNumOfDigits(int digits) {
        int count = 1;
        while (digits / 10 != 0) {
            digits /= 10;
            count++;
        }
        return count;
    }
    
    public int[] getDigits(int num) {
        int[] arrayOfDigits = new int[getNumOfDigits(num)];
        for (int i = 0; i < arrayOfDigits.length; i++) {
            arrayOfDigits[i] = num % 10; 
            num /= 10;
        }
        return arrayOfDigits;
    }
    
    
    
}