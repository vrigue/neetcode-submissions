class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }

        int temp = x;
        x = Math.abs(x);
        long res = Long.parseLong(new StringBuilder(String.valueOf(x)).reverse().toString());
        if (temp < 0) {
            res *= -1;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)res;
    }
}
