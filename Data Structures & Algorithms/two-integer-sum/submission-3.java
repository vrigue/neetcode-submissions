class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i1 = 0;
        int i2 = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                i1 = map.get(difference);
                i2 = i;
            } else {
                map.put(nums[i], i);
            }
        }

        int[] arr = {i1, i2};
        return arr;
    }
}
