class Solution {
    public int finalValueAfterOperations(String[] operations) {
        HashMap<String, Integer> op = new HashMap<>();
        op.put("X++", 1);
        op.put("++X", 1);
        op.put("X--", -1);
        op.put("--X", -1);
        
        int sum = 0;
        
        for (int i = 0; i < operations.length; i++) {
            if (op.containsKey(operations[i])) {
                sum += op.get(operations[i]);
            }    
        }
        
        return sum;
    }
}