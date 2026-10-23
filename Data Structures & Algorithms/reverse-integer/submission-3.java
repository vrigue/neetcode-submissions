class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }

        int org = x;
        x = Math.abs(x);
        String rev = new StringBuilder(String.valueOf(x)).reverse().toString();
        long res = Long.parseLong(rev);

        if (org < 0) {
            res *= -1;
        } 

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
}
