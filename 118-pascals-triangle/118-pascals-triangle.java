class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> rows = new ArrayList<List<Integer>>();
        ArrayList<Integer> rows2 = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows2.add(0, 1);
            for (int j = 1; j < rows2.size()-1; j++) {
                rows2.set(j, rows2.get(j) + rows2.get(j+1));
            }
            rows.add(new ArrayList<Integer>(rows2));
        }
        return rows;
    }
}