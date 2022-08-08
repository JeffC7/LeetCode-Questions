class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else {
                if (i+1 >= flowerbed.length || flowerbed[i+1] == 0)  {
                    n--;
                    i += 2;
                } else {
                    i++;
                }
            }
               
        } 
            
        if (n <= 0) 
            return true;
        
        return false;
    }
}