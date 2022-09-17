class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> currList;
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if (map.containsKey(s)) {
                currList = map.get(s);
                currList.add(strs[i]);
                map.put(s, currList);
            } else {
                currList = new ArrayList<>();
                currList.add(strs[i]);
                map.put(s, currList);
            }
        }
        
        for(String key: map.keySet()) {
            list.add(map.get(key));
        }
        return list;
    }
}