class Solution {
    public int firstUniqChar(String s) {
        if (s == "") {
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
            
            if (!q.contains(c)) {
                q.add(c);
            }
        }

        while (!q.isEmpty()) {
            char letter = q.poll();
            int freq = map.get(letter);
            if (freq == 1) {
                return s.indexOf(letter);
            }
        }

        return -1;
    }
}