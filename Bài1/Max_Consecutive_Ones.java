// 21/08/2024 

class Solution {

    public int findMaxConsecutive(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);

            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 0, 1, 1, 1, 1};
        System.out.println(s.findMaxConsecutive(nums));
    }
}
