class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = Arrays.toString(arr);
            if (map.containsKey(key)) {
                (map.get(key)).add(str);
            }
            else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key, temp);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }
}
