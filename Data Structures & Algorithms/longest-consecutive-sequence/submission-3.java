class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 1;

        for (int i = 0; i < nums.length; i++) {
            int len = 1;
            if (!set.contains(nums[i] - 1)) {
                int next = nums[i] + 1;
                while (set.contains(next)) {
                    len++;
                    next++;
                }
            }

            if (max < len) {
                max = len;
            }
        }

        return max;
    }
}
