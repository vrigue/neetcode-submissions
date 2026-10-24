class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(String.valueOf(str.length()));
            res.append(",");
        }

        res.append("#");

        for (String str : strs) {
            res.append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;

        while (str.charAt(i) != '#') {
            StringBuilder lenStr = new StringBuilder();
            while (str.charAt(i) != ',') {
                lenStr.append(str.charAt(i));
                i++;
            }
            i++;
            int len = Integer.parseInt(lenStr.toString());
            sizes.add(len);
        }
        i++;

        for (int size : sizes) {
            String s = str.substring(i, i + size);
            res.add(s);
            i += size;
        }

        return res;
    }
}
