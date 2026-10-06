class Solution {

    public int[] sortArray(int[] nums) {

        mergesort(nums, 0, nums.length - 1);

        return nums;
    }

    void mergesort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergesort(nums, left, mid);
        mergesort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    void merge(int[] nums, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            }
            else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            nums[i] = temp[k];
        }
    }
}