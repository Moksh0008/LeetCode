class Solution {
    public int pivotIndex(int[] nums) {

        int[] prefixleft = new int[nums.length];
        int[] prefixright = new int[nums.length];

        prefixleft[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixleft[i] = prefixleft[i - 1] + nums[i];
        }

        prefixright[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            prefixright[i] = prefixright[i + 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            if (i > 0)
                left = prefixleft[i - 1];
            if (i < nums.length - 1)
                right = prefixright[i + 1];
            if (left == right)
                return i;
        }

        return -1;
    }
}