class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int[] arr = new int[k];
        int[] arr2 = new int[nums.length - k];

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - k) {
                arr2[i] = nums[i];
            }
            else {
                arr[i - (nums.length - k)] = nums[i];
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            nums[k + i] = arr2[i];
        }
    }
}