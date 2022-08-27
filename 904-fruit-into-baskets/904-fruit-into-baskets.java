class Solution {
    public int totalFruit(int[] fruits) {
        int winStart = 0, maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int winEnd = 0; winEnd < fruits.length; winEnd++) {
            map.put(fruits[winEnd], map.getOrDefault(fruits[winEnd], 0) + 1);
            
            while (map.size() > 2) {
                map.put(fruits[winStart], map.get(fruits[winStart]) - 1);
                if (map.get(fruits[winStart]) == 0) {
                    map.remove(fruits[winStart]);
                }
                winStart++;
            }
            maxCount = Math.max(maxCount, winEnd - winStart + 1);
        }
        return maxCount;
    }
}