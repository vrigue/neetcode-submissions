class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sC = s.toCharArray();
        char[] tC = t.toCharArray();

        Arrays.sort(sC);
        Arrays.sort(tC);

        s = Arrays.toString(sC);
        t = Arrays.toString(tC);

        return s.equals(t);
    }
}
